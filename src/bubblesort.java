public class bubblesort
{
   public static void main(String[] args)
   {
	 
     //String s = Integer.toString(123456,16);//��ʮ���Ƶ�123456ת����16���Ƶ��ַ�
     //long a=Integer.valueOf("6FFFffff",16);//��16���Ƶ��ַ���ת��������
     //System.out.println(a);
	  /*double i= 2147483648.0;
	  System.out.println(i);*/
	   int i =Long.SIZE;//2147483649;
	   System.out.println(i);
   }
} 




/*import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

*//**
 * @author liumin 
 *//*
public class IPconv 
{
	 
    public static String long2ip(long iplong)
    {
        long mask[]={0x000000FF,0x0000FF00,0x00FF0000,0xFF000000};
    	long num = 0; 
        StringBuffer ipInfo = new StringBuffer(); 
        for(int i=0;i<4;i++)
        { 
            num = (iplong & mask[i])>>(i*8); 
            if(i>0) 
            	ipInfo.insert(0,"."); 
            ipInfo.insert(0,Long.toString(num,10)); 
        }  
        return ipInfo.toString(); 
    }  
    	//try                             //���ļ���ʽ���
    	//{
    		//File  f=new File("dotted decimal.txt");
    		//FileOutputStream    fos=new  FileOutputStream(f);
    		//FileOutputStream    out=new  DataOutputStream(fos);
    		//out.writerUTF("flag");
    	//}
    	//catch (IOException ioe)
    	//{
    		//writeErr(ioe);
    	//}
    //}
	
	
	
	public static void main(String[] args)
   {
      try 
      {
         FileReader read = new FileReader("F:/net1.txt");//׼���ļ�
         BufferedReader br = new BufferedReader(read);//���ַ�����ȡ�ļ�
         String row;
         while((row = br.readLine())!=null) //���ж�ȡ
         {
        	 String ip=row.substring(2,10);
         	 long iplong= Integer.valueOf(ip, 16);//���ַ���ת��Ϊ����
             System.out.println(long2ip(iplong) );//�������ã�����ļ�������ִ�У�
         }
       }
      catch (FileNotFoundException e)
      {
         e.printStackTrace();
      } 
      catch (IOException e)
      {
         e.printStackTrace();
      }
   }
    
    
}*/