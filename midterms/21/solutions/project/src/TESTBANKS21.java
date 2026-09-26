 import java.util.*;
 /**
  يبغانا نكتب برنامج يقرا سترنق
   ويحدد التالي
   1- vowels=حروف العله
   والي هم  
    a,o,i,u,e
    2-constant=(non-vowel)=بقيه الحروف غير الخمس الي فوق
    3-others=(اي شيء ثاني بالكيبورد غير الحروف الانقليزيه السته وعشرين)
    مثال
    ! 2 > ؛ ؟ @ -  = +  
    وهكذا
    ---------------------------------------
    يبينا نطبع له
    1-حروف العله وعددها
    2-والحروف الباقيه غير العله
    3-اي شيء غير السته وعشرين حرف
    
  */
 //ويقولك تلميح اذا بتطبع شيء غير السته وعشرين حرف تراه مابيكون موجود بين 
 //a-z or A-Z
 //-------------------------------------------------------------------
 //قبل تبدا تحل فكر كيف تقسم المشكله ذي لاقسام صغيره عشان تسهل عليك 
 //-------------------------------------------------------------------
public class TESTBANKS21 {

    
    public static void main(String[] args) {
        Scanner ABDO = new Scanner (System.in);
        System.out.println("Please enter a string :");
        String sentance=ABDO.next();// نقرا الكلمه
        //نبد اول جزء  
        int length=sentance.length();//نطلع طول الكلمه ونحطه بمتغير 
        int pos=0;//عرفنا متغير عشان نقارن فيه ونمشي فيه على الجمله 
        int a=0,e=0,o=0,i=0,u=0;//سوينا هنا عداد باسم كل حرف من الحروف الثابته
        int constant=0;
        int other=0;
        System.out.print("Vowels enterd : ");
        while(pos<length){
            char OneByOne=sentance.charAt(pos);//نبيه يمشي من الصفر على طول السترنق حقنا 
            //بنسوي  اف ستيمتنت ونخليه كل ماجاء على حرف من الحروف الخمسه يطبعه
            if((OneByOne=='A'||OneByOne=='a')||(OneByOne=='U'||OneByOne=='u')||(OneByOne=='E'||OneByOne=='e')||(OneByOne=='I'||OneByOne=='i')||(OneByOne=='O'||OneByOne=='o')){
                System.out.print(OneByOne);
            }
            //نبد الجزء الثاني
            //نحسب كل نوع  من الخمسه حروف
            switch (OneByOne) {
                case 'a':
                case 'A':
                    a++;
                    break;
                case 'u':
                case 'U':
                    u++;
                    break;
                case 'E':
                case 'e':
                    e++;
                    break;
                case 'I':
                case 'i':
                    i++;
                    break;
                case 'O':
                case 'o':
                    o++;
                    break;
                default:
                    break;
            }
            pos++;
        }//while loop ends here
        System.out.println("");
        System.out.println("(a or A) :"+a);
        System.out.println("(e or E) :"+e);
        System.out.println("(i or I) :"+i);
        System.out.println("(o or O) :"+o);
        System.out.println("(u or U) :"+u);
        //---------------------------
        //خلصنا هنا من الخمس حروف 
        //نبدا الجزء الثالث والاخير
        pos=0;
            System.out.println("Constants enterd : ");
        while(pos<length){
        char OneByOne=sentance.charAt(pos);
        //بنطلع الحروف الباقيه باني اقوله مر على السته وعشرين حرف بدون مايكون الحرف من الخمسه
        //
        if(((OneByOne>='a' && OneByOne<='z')||(OneByOne>='A')&&(OneByOne<='Z'))&&
                (OneByOne!='a'&&OneByOne!='A')&&
                (OneByOne!='u'&&OneByOne!='U')&&
                (OneByOne!='E'&&OneByOne!='e')&&
                (OneByOne!='I'&&OneByOne!='i')&&
                (OneByOne!='O'&&OneByOne!='o'))
            System.out.print(OneByOne);
        
            pos++;
         
        
        }//second while loop ends here
        System.out.println("");
        pos=0;
        //الحين بنخش بالاشياء غير السته وعشرين حرف
        System.out.print("Other characters enterd : ");
        while(pos<length){
        char OneByOne=sentance.charAt(pos);
        if(!(OneByOne>='a' && OneByOne <='z')&& !(OneByOne>='A')&&(OneByOne<='Z')) 
            System.out.print(OneByOne);
            pos++;
          

        } System.out.print("");

    }//main ends here

}