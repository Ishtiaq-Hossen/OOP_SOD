
# OOP SOD Code material




## Guided by SKD sir
IUB student will get practice code material here

__Some important url that can help student__
 - [OOP Class Task Code Autumn2022](https://github.com/Ishtiaq-Hossen/University-Courses/tree/main/OOP/ClassTask)
 - [Some FXML Project Autumn2022](https://github.com/Ishtiaq-Hossen/University-Courses/tree/main/OOP/FXML_Project)
 - [Some OOP Concept with C++](https://github.com/Ishtiaq-Hossen/University-Courses/tree/main/OOP/OOP%20with%20cPlusPlus)


<details><summary><b>Variable in java</b></summary>

Java all data type with initialization

```java
       
    boolean b;
    char c;
    short s;
    int i;
    float f;
    double d;
    b=true;
        
    i=10;
    c='a';
    b=true;
    f=10.2f;
    d=10.256;
    System.out.println("i = "+i);
    System.out.println("c = "+c);
    System.out.println("b = "+b);
    System.out.println("f = "+f);
    System.out.println("d = "+d+f );
    System.out.println("==============");
        
    System.out.printf("i = %d\n",i);
    System.out.printf("c = %c\n",c);
    System.out.printf("b = %b\n",b);
    System.out.printf("f = %.1f\n",f);
    System.out.printf("d = %.2f\n",d );

```

</details>

<details><summary><b>User Input</b></summary>

### Charater Input

```java
       
package beginnerjava;
import java.util.Scanner;

public class inputDemo {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
        char ch;
        ch=input.next().charAt(0);
        
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')System.out.print("Vowel\n");
        else System.out.print("Consonant\n");
        
        
        // By using switch statement
        /*
        switch(ch)
        {
            case 'a':
                System.out.println("Vowel\n");
                break;
            case 'e':
                System.out.println("Vowel\n");
                break;
            case 'i':
                System.out.println("Vowel\n");
                break;
            case 'o':
                System.out.println("Vowel\n");
                break;
            case 'u':
                System.out.println("Vowel\n");
                break;
            default:
                System.out.println("Consonant");
        }
        */
     } 
      
}
        
```

### String,Integer & Double Input 

```java
        Scanner input=new Scanner(System.in);
        
        //=======Integer input====/
        int number;
        System.out.print("Enter any number: ");
        number=input.nextInt();
        System.out.println("Number = "+number);
        input.nextLine();
        
        //=======String input====/
        String name;
        System.out.print("Enter your name: ");
        name =input.nextLine();        
        System.out.println("Welcome: "+name);
        
        //=======double input====/
        double num1;
        num1=input.nextDouble();
        System.out.println("Here is the double value: "+num1);

```

</details>



<details><summary><b>Basic ArrayList Code</b></summary>

ArrayList Initialization & iteration

```java
  import java.util.ArrayList;
  public class arraydemo {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList();
        list.add("Hello");
        list.add("Hati");
        /*
        for(auto a:list)  //by using for each loop
          System.out.print(a + " ");
        */
        for (int i = 0; i < list.size(); i++)
          System.out.print(list.get(i) + " ");   
    }
    
    
  }
```

</details>

<details><summary><b>Scene switching code</b></summary>

```java

Parent scene2Parent = FXMLLoader.load(getClass().getResource("Scene1.fxml"));//here switching scene fxml should be attached
Scene scene2 = new Scene(scene2Parent);
Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();  
stg2.setScene(scene2);
stg2.show();

```
</details>


<details><summary><b>Stage switching code</b></summary>

```java

Parent fileChooserViewParent = FXMLLoader.load(getClass().getResource("window1.fxml"));//here switching stage fxml should be attached
Scene fileChooserViewScene = new Scene(fileChooserViewParent);
Stage newWindow  = new Stage();
newWindow.setTitle("File Chooser Test Stage");
newWindow.setScene(fileChooserViewScene);
newWindow.show();

```
</details>

<details><summary><b>File Reading & Writing</b></summary>
 
```java
@FXML
private void createFileBtnOnClick(ActionEvent event) {
        if(!isTextFileChkBox.isSelected() && !isBinFileChkBox.isSelected())
        {
            Alert a = new Alert(AlertType.ERROR);
            a.setContentText("Oops! No fileType Selected. \nCan't save to file.");
            a.showAndWait();
        }
        //=====creating text file code starts from here====/


        if(isTextFileChkBox.isSelected()){
            FileWriter fw=null;
            try {
                //write code to dump studArr in Stud.txt
                //use FileWriter
                File f = new File("studText.txt");
                
                //FileWriter fw = new FileWriter(f);
                if(f.exists())
                    fw = new FileWriter(f,true);
                else 
                    fw = new FileWriter(f);
                    //fw = new FileWriter("studText.txt");
                String str="";
                for(Student s: studArr){
                    str += s.getId()+","+s.getName()+","+s.getCgpa()+"\n";
                    //str += s; 
                    //if toString is overridden to return
                    //return id+","+name+","+cgpa+"\n"
                }
                fw.write(str);  //fw.write(s.toString());
                fw.close();
            } catch (IOException ex) {
                
                //SHOW ex.toString() IN AN ALERT
            }
            /*
            finally{
                try {
                    fw.close();
                } catch (IOException ex) {
                    Logger.getLogger(FXMLMainSceneController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            */

        }

        //=====creating bin file code starts from here====/

        if(isBinFileChkBox.isSelected()){
            //write code to dump studArr in Stud.bin
            //1: write the individual fields using data stream
             try{
                FileOutputStream fos = new FileOutputStream("studData.bin", true);
                DataOutputStream dos = new DataOutputStream(fos);
                for(Student s: studArr){
                    dos.writeInt(s.getId());
                    dos.writeUTF(s.getName());
                    dos.writeFloat(s.getCgpa());
                }
                dos.close();
            }
            catch(Exception e){
                //SHOW e.toString() IN AN ALERT
            }           


            //=======creating Object file code starts from here=======/

            //2: write the Student instance using object stream
            try{
                FileOutputStream fos = new FileOutputStream("studObjects.bin",true);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                for(Student s: studArr)
                    oos.writeObject(s);
                oos.close();
            }
            catch(Exception e){
                //SHOW e.toString() IN AN ALERT
            }
        }
        studArr.clear();
}


    //=====Reading from text file code starts from here====/

    @FXML
    private void readFromTextFileBtnOnClick(ActionEvent event) {
        //use BufferedReader OR Scanner
        File file = new File("StudText.txt");
        Scanner sc; String str=null;
        try {
            sc = new Scanner(file);
            outputTxtArea.setText(null);
            while(sc.hasNextLine()){
                str=sc.nextLine();
                String[] tokens;
                tokens = str.split(",");
                str = "Id="+tokens[0]+", Name="+tokens[1]
                        +", Cgpa="+tokens[2];
                outputTxtArea.appendText(str+"\n");
                //outputTxtArea.appendText("\n");               
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FXMLMainSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }

    //=====Reading from Object-bin file code starts from here====/
    @FXML
    private void readFromBinFileUsingObjectStreamBtnOnClick(ActionEvent event) {
        //use ObjectInputStream
        ObjectInputStream ois=null;
         try {
             Student s;
             //FileInputStream fis = new FileInputStream("studObjects.bin");
             //ois = new ObjectInputStream(fis);
             ois = new ObjectInputStream(new FileInputStream("StudObjects.bin"));
             
            outputTxtArea.setText(null);
            
            //int[] arr={1,2,3};
            //System.out.println(arr[3]);
            while(true){
                s = (Student) ois.readObject();
                //studArr.add((Student) ois.readObject());
                outputTxtArea.appendText(s.toString()+"\n");
                //outputTxtArea.appendText(s+"\n");
            }
            //ois.close();
                       
        }
        catch(RuntimeException e){
            e.printStackTrace();
             //
        }
        catch (Exception ex) {
            try {
                if(ois!=null)
                    ois.close();
            } catch (IOException ex1) {  }           
        }
    }

    //=====Reading from bin file code starts from here====/
    @FXML
    private void readFromBinFileUsingDataStreamBtnOnClick(ActionEvent event) throws IOException {
            FileInputStream fis = null;
            DataInputStream dis = null;
            try{
                //FileInputStream fis = new FileInputStream("studData.bin");
                File f = new File("studData.bin");
                fis = new FileInputStream(f);
                dis = new DataInputStream(fis);
                //outputTxtArea.setText(null);  //OK
                //outputTxtArea.setText("");   // OK
                outputTxtArea.clear();
                while(true){

                    outputTxtArea.appendText(
                        "Id is: " + dis.readInt() +
                        ", Name is: " + dis.readUTF() +
                        ", Cgpa is: " + dis.readFloat() + "\n"
                    );
                }
                //dis.close();
            }
            catch(Exception e){
                //Alert a = new Alert(AlertType.INFORMATION);
                //a.setContentText(e.toString());
                //a.setContentText("Content from Data file is loaded successfully.");
                //a.showAndWait();                
                dis.close();
                //SHOW e.toString() IN AN ALERT
            }          

    }

```

</details>

## Authors

- [Ishtiaq Hossen](https://github.com/Ishtiaq-Hossen)

