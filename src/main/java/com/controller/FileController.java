package com.controller;

import com.annotation.IgnoreAuth;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.entity.ConfigEntity;
import com.entity.EIException;
import com.service.ConfigService;
import com.utils.PathUtils;
import com.utils.R;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Objects;

/**
 * 上传文件映射表
 */
@RestController
@RequestMapping("file")
@SuppressWarnings({"unchecked", "rawtypes"})
public class FileController {
    @Autowired
    private ConfigService configService;

    /**
     * 上传文件
     */
    @RequestMapping("/upload")
    public R upload(@RequestParam("file") MultipartFile file, String type) throws Exception {
        if (file.isEmpty()) {
            throw new EIException("上传文件不能为空");
        }
        String rootPath = PathUtils.getClassLoadRootPath();
        File path = new File(rootPath);
        if (!path.exists()) {
            path = new File("");
        }
        File upload = new File(path.getAbsolutePath(), "/upload/");
        if (!upload.exists()) {
            upload.mkdirs();
        }
        // 文件后缀
        String fileExt = Objects.requireNonNull(file.getOriginalFilename()).substring(file.getOriginalFilename().lastIndexOf(".") + 1);
        // 生成新的文件名
        String fileName = new Date().getTime() + "." + fileExt;
        // 创建 file对象
        File dest = new File(upload.getAbsolutePath() + "/" + fileName);
        // 把浏览器上传的文件复制到希望的位置
        file.transferTo(dest);

        // 保存文件地址到数据库
        if (StringUtils.isNotBlank(type) && type.equals("1")) {
            ConfigEntity configEntity = configService.selectOne(new EntityWrapper<ConfigEntity>().eq("name", "faceFile"));
            if (configEntity == null) {
                configEntity = new ConfigEntity();
                configEntity.setName("faceFile");
                configEntity.setValue(fileName);
            } else {
                configEntity.setValue(fileName);
            }
            configService.insertOrUpdate(configEntity);
        }
        return R.ok().put("file", fileName);
    }

    /**
     * 下载文件
     */
    @IgnoreAuth
    @RequestMapping("/download")
    public ResponseEntity<byte[]> download(@RequestParam String fileName) {
        try {
            File path = new File(ResourceUtils.getURL("classpath:static").getPath());
            if (!path.exists()) {
                path = new File("");
            }
            File upload = new File(path.getAbsolutePath(), "/upload/");
            if (!upload.exists()) {
                upload.mkdirs();
            }
            File file = new File(upload.getAbsolutePath() + "/" + fileName);
            if (file.exists()) {
				/*if(!fileService.canRead(file, SessionManager.getSessionUser())){
					getResponse().sendError(403);
				}*/
                HttpHeaders headers = new HttpHeaders();
                headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
                headers.setContentDispositionFormData("attachment", fileName);
                return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file), headers, HttpStatus.CREATED);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ResponseEntity<byte[]>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
