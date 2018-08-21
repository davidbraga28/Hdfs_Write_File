package hdfs_teste.hdfs_teste;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

/**
 * Hello world!
 *
 */
public class Teste 
{
    public static void main( String[] args ) throws IOException
    {
    	
		FileSystem fs = FileSystem.get(new Configuration()); 
		
        OutputStreamWriter outPutStreamWriter = new OutputStreamWriter(fs.create(new Path(args[0])), "UTF-8");
        BufferedWriter writer = new BufferedWriter(outPutStreamWriter);

	    writer.write("teste...");
	    writer.flush();
	    writer.close();
    }
}
