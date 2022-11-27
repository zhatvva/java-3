package dao;

import model.File;

import java.util.ArrayList;

public interface FilesBaseDAO {

    ArrayList<File> readFilesFromXml();
    ArrayList<File> parseXmlToTheListOfFiles(String xml);
    ArrayList<File> getFiles();
    StringBuilder getXmlElement(File file);
    String getXmlDocument(ArrayList<File> files);
    void writeFilesToXmlFile();
}
