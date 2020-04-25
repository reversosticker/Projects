import java.io.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.LoggingMXBean;

import pember.kmeans.geo.Cluster;
import pember.kmeans.geo.ClusterService;
import pember.kmeans.geo.GeographicPoint;

public class phiboScheduling {
    String search(List<point> points,BigDecimal x,BigDecimal y)
    {
            Iterator<point> iterator=points.iterator();
          while(iterator.hasNext())
          {    point p=iterator.next();
             // System.out.println(x+" value of the "+p.getLatitude());
              if(p.getLatitude().equals(x) && p.getLongitude().equals(y))
              {
                  return p.name;
              }
          }
          return null;
    }
    public static void main(String [] args) throws IOException {

        FileReader fileReader=new FileReader("/home/sticker/IdeaProjects/PhiboScheduling/finaldataset.txt");
        String line=null;
        BufferedReader bufferedReader= new BufferedReader(fileReader);
        int i=0;
               // new ArrayList<>();
        List<point> searchpoint=new ArrayList<>();
        List<pember.kmeans.geo.GeographicPoint> points=new ArrayList<>();
        String datasets [];
        try {
                    while((line= bufferedReader.readLine())!=null)
                    {
                        datasets=line.split("\t");
                        //e=datasets[1]+" "+datasets[2];
                        System.out.println(line);
                        point p=new point(datasets[0],( new BigDecimal(datasets[1])),new BigDecimal(datasets[2]));
                         points.add(p);
                         searchpoint.add(p);
                         }
            System.out.println(points.size());
       }catch (IOException e)
       {
           System.out.println(i);
       }
        List<pember.kmeans.geo.Cluster> clusters = ClusterService.cluster(points,5);
         Iterator<Cluster>  iterable = clusters.iterator();
         i=1;
         while(iterable.hasNext())
         {
             Cluster cluster=iterable.next();
             //System.out.println(cluster.getLatitude()+" "+cluster.getLongitude());
             Set<GeographicPoint> pointSet=cluster.getPoints();
             System.out.println(pointSet.size()+" is size of cluster" + i++);
             Iterator<GeographicPoint> iterator=pointSet.iterator();
             while(iterator.hasNext())
             {   GeographicPoint geographicPoint=iterator.next();
                 String name=new phiboScheduling().search(searchpoint,geographicPoint.getLatitude(),geographicPoint.getLongitude());
                 System.out.println(name+" ");
                 System.out.println(geographicPoint.getLatitude()+" "+geographicPoint.getLongitude());
                 System.out.println("-------- ");

             }
             System.out.println();
         }

    }

}
