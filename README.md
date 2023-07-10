
# OOP SOD Code material




## Guided by SKD sir
IUB student will get practice code material here

__Some important url that can help student__
 - [OOP Class Task Code Autumn2022](https://github.com/Ishtiaq-Hossen/University-Courses/tree/main/OOP/ClassTask)
 - [Some FXML Project Autumn2022](https://github.com/Ishtiaq-Hossen/University-Courses/tree/main/OOP/FXML_Project)
 - [Some OOP Concept with C++](https://github.com/Ishtiaq-Hossen/University-Courses/tree/main/OOP/OOP%20with%20cPlusPlus)



## Basic ArrayList Code

ArrayList Initialization & iteration

```bash
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
## Scene switching code

```

Parent scene2Parent = FXMLLoader.load(getClass().getResource("Scene1.fxml"));//here switching scene fxml should be attached
Scene scene2 = new Scene(scene2Parent);
Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();  
stg2.setScene(scene2);
stg2.show();

```

## Stage switching Code
```

Parent fileChooserViewParent = FXMLLoader.load(getClass().getResource("window1.fxml"));//here switching stage fxml should be attached
Scene fileChooserViewScene = new Scene(fileChooserViewParent);
Stage newWindow  = new Stage();
newWindow.setTitle("File Chooser Test Stage");
newWindow.setScene(fileChooserViewScene);
newWindow.show();

```

## Authors

- [Ishtiaq Hossen](https://github.com/Ishtiaq-Hossen)

