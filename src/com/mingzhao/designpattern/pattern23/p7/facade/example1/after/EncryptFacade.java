package com.mingzhao.designpattern.pattern23.p7.facade.example1.after;

/**
 * Created by SEELE on 2018/4/3.
 */
public class EncryptFacade {
    private FileReaderIn fileReaderIn;
    private  CipherMachine cipherMachine;
    private  FileWriterOut fileWriterOut;

    public EncryptFacade(){
        fileReaderIn = new FileReaderIn();
        cipherMachine =new CipherMachine();
        fileWriterOut =new FileWriterOut();
    }

    public void fileEncrypt(String fileNameSrc,String FileNameDes){
        String text = fileReaderIn.read(fileNameSrc);
        String encryptStr = cipherMachine.Encrypt(text);
        fileWriterOut.write(encryptStr, FileNameDes);
    }

}
