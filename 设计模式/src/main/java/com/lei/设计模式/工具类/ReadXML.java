package com.lei.设计模式.工具类;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

/**
 * 学习
 *
 * @author: leiwe
 * @date 2020-03-20 14:05
 */
public class ReadXML {
        //该方法用于从XML配置文件中提取具体类类名，并返回一个实例对象
        public static Object getObject(Class<?> cls,String filePath)
        {
            try
            {
                //创建文档对象
                DocumentBuilderFactory dFactory=DocumentBuilderFactory.newInstance();
                DocumentBuilder builder=dFactory.newDocumentBuilder();
                Document doc=builder.parse(cls.getResource(filePath).getPath());
                //获取包含类名的文本节点
                NodeList nl=doc.getElementsByTagName("className");
                Node classNode=nl.item(0).getFirstChild();
                String cName=cls.getPackage().getName()+"."+classNode.getNodeValue();
                //System.out.println("新类名："+cName);
                //通过类名生成实例对象并将其返回
                Class<?> c=Class.forName(cName);
                Object obj=c.newInstance();
                return obj;
            }
            catch(Exception e)
            {
                e.printStackTrace();
                return null;
            }
        }

}
