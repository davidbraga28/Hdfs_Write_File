package hdfs;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

public class WriteFile 
{
    public static void main( String[] args ) throws IOException
    {
    	
	FileSystem fs = FileSystem.get(new Configuration()); 
		
        OutputStreamWriter outPutStreamWriter = new OutputStreamWriter(fs.create(new Path(args[0])), "UTF-8");
        BufferedWriter writer = new BufferedWriter(outPutStreamWriter);

	writer.write("Hello, i am write this file!!");
	writer.flush();
	writer.close();
    }
}
