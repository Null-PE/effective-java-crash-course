package weekx;

import java.io.IOException;

public class CloseResource {

    /**
     * TODO readLine()で起こったExceptionをclose()のExceptionに上書きされないよう　コードを修正
     */
    public static String readFirstLine() throws IOException {
        SampleReader reader = new SampleReader();
        try {
            return reader.readLine();
        } finally {
            reader.close();
        }
    }

}
