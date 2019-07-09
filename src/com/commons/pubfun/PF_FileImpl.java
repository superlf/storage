package com.commons.pubfun;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;

import java.io.File;

/**
 * <p> </p>
 *
 * @Author : lfx
 * @CreateDate: 2019/7/9
 */
public class PF_FileImpl implements PubFun_File {

    /** 文件名 */
    private String fileName;
    /** 文件绝对路径 */
    private File fileRealName;
    private String filePath;
    /** 文件后缀名 */
    private String fileExtName;

    public PF_FileImpl() {

    }

    public PF_FileImpl(String path,File file) {
        this.fileName = file.getName();
        this.fileExtName = FilenameUtils.getExtension(fileName);

    }

    @Override
    public boolean checkFile() {

        return false;
    }

    @Override
    public boolean uploadFile() {
        return false;
    }

    @Override
    public boolean downloadFile() {
        return false;
    }

    @Override
    public boolean importExcel() {
        return false;
    }

    @Override
    public boolean exportExcel() {
        return false;
    }


    public static void main(String[] args) {
        PF_FileImpl pf = new PF_FileImpl();

    }

}
