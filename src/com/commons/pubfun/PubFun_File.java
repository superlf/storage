package com.commons.pubfun;

/**
 * <p> </p>
 *
 * @Author : lfx
 * @CreateDate: 2019/7/9
 */
public interface PubFun_File {

    /* 文件格式校验 */
    public boolean checkFile();

    /* 上传文件 */
    public boolean uploadFile();

    /* 文件下载 */
    public boolean downloadFile();

    /* Excel导入数据库 */
    public boolean importExcel();

    /* 数据库导入Excel */
    public boolean exportExcel();


}
