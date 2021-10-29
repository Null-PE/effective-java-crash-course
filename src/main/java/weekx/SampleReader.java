package weekx;

import java.io.IOException;

public class SampleReader implements AutoCloseable{

    /**
     * Close処理でException発生
     */
    @Override
    public void close() throws IOException {
        throw new IOException("Close Exception");
    }

    /**
     * Read処理中Exception発生
     */
    public String readLine() throws IOException{
        throw new IOException("Readline Exception");
    }

}
