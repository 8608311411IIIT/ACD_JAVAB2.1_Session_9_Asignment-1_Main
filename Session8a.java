/*A simple program which create a class HDTV and then copy it in arraylist.then by the use of comparator we sort it on basis of size and then print
   the data*/
 
import java.util.*;

 
public class Session8a {
     
      public static void main(String []args){
              HDTV h1=new HDTV("sparky",45);//passing value to constructor of HDTV
              HDTV h2=new HDTV("jockey",30);//passing value to constructor of HDTV
              HDTV h3=new HDTV("raymond",50);//passing value to constructor of HDTV

              ArrayList<HDTV> arlist=new ArrayList<HDTV>();
              arlist.add(h1);//adding the data of HDTV class to arraylist
              arlist.add(h2);//adding the data of HDTV class to arraylist
              arlist.add(h3);//adding the data of HDTV class to arraylist
              Collections.sort(arlist,new MySizeComp());//sort by use of comparatable interface
              Iterator itr=arlist.iterator();
              while(itr.hasNext()){
                        HDTV hd=(HDTV)itr.next();
                        System.out.println(" "+ hd.Brandname+" "+hd.size);
              }
 
        
      }
}
 

 
class MySizeComp implements Comparator<HDTV>{
 
    @Override
    public int compare(HDTV e1, HDTV e2) {//compare size of subsequent lists
        if(e1.size > e2.size){
            return 1;
        } else {
            return -1;
        }
    }
}

class HDTV{
     
       String Brandname;
       int size;
     
        public HDTV(String name,int size){//consructor which initializes the varibles
              this.Brandname=name;
              this.size=size;
     
        }
}

