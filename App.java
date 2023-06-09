/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package a3;


import java.util.List;

class Account extends Folder{
    private String username;
    private String password;
    private String email;
    

    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void upload(File file, Folder folder) {
        // code to upload the file to the specified folder
    }
    
    public void download(File file, Folder folder) {
        // code to download the file from the specified folder
    }
    
    public void delete(File file, Folder folder) {
        // code to delete the file from the specified folder
    }
}

class File{
    private String filename;
    private String filetype;
    private int size;
    private String content;
    
  
    
    public String getFilename() {
        return filename;
    }
    
    public void setFilename(String filename) {
        this.filename = filename;
    }
    
    public String getFiletype() {
        return filetype;
    }
    
    public void setFiletype(String filetype) {
        this.filetype = filetype;
    }
    
    public int getSize() {
        return size;
    }
    
    public void setSize(int size) {
        this.size = size;
    }
    
    public String getContent() {
        return content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
}

    class Folder  extends File{

    private String foldername;
    private List<File> files;
    private List<Folder> subfolders;
    

    public String getFoldername() {
        return foldername;
    }
    
    public void setFoldername(String foldername) {
        this.foldername = foldername;
    }
    
    public List<File> getFiles() {
        return files;
    }
    
    public void addFile(File file) {
        this.files.add(file);
    }
    
    public List<Folder> getSubfolders() {
        return subfolders;
    }
    
    public void addSubfolder(Folder subfolder) {
        this.subfolders.add(subfolder);
    }
}

public class App {
    public String getGreeting() {
        return "This is my final assignment";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
