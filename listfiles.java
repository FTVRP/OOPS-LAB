import java.io.File;
import java.util.Scanner;
public class listfiles{
  public static void main(String[]args){
   Scanner Sc=new Scanner(System.in);
   System.out.print("Enter directory path:");
   String path = Sc.nextLine();
   File directory=new File(path);
   if(directory.exists() && directory.isDirectory()){
     File[]files=directory.listFiles();
     System.out.println("\nfiles in the directory:");
     if(files !=null){
        for(File file:files){
         if(file.isFile()){
            System.out.println(file.getName());
            }
          }
        }else{
          System.out.println("Invalid directory path.");
          }
          Sc.close();
          }
         }
        }
