public class Mobile{
int qty;
String name;
Mobile(int qty,String name){
this.name=name;
this.qty=qty;
}
public static void main(String args[]){
Mobile m=null;
m=new Mobile(2,"ONEPLUSNOCH");
System.out.println(m.name);
System.out.println(m.qty);
} 