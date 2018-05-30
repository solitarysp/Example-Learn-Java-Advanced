package com.higg.buffer;

import com.higg.until.Var;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ExampleCompactAndClear {
    public static void main(String[] args) throws IOException {
        File file = new File(Var.URL_FILE_TEST);
        FileChannel fileChannel = null;
        FileInputStream fileInputStream = null;
        ByteBuffer byteBuffer = null;
        try {
            fileInputStream = new FileInputStream(file);// chuyền file vào
            fileChannel = fileInputStream.getChannel();// get về một channel
            byteBuffer = ByteBuffer.allocate((int) fileChannel.size());// tạo buffter với tổng dung lượng của file
            int result = fileChannel.read(byteBuffer);// đọc dữ liệu vào bộ nhớ đệm
            while (result != -1) {

                byteBuffer.flip();  //làm buffter sẵn sàn để đọc
                boolean isTrue = true;
                int index = 0;
                while (byteBuffer.hasRemaining() && isTrue) {
                    byteBuffer.get(); //đọc 1 type dữ liệu 1 lần đọc.
                    index++;
                    if (index == fileChannel.size() - 5) {
                        isTrue = !isTrue;
                    }
                }

                byteBuffer.compact(); //xoá sạch dữ liệu trong buffter đẽ sẵn sàn cho lần mới.
                result = fileChannel.read(byteBuffer);// set lại số type chưa đoc
                byteBuffer.put((byte) 97);//put dữ liệu mới
                byteBuffer.put((byte) 98);//put dữ liệu mới
                byteBuffer.flip();// chuyển từ viết sang đọc
                // nếu k có sẽ gọi về dữ liệu cũ

                while (byteBuffer.hasRemaining()) {
                    System.out.print((char) byteBuffer.get()); //đọc 1 type dữ liệu 1 lần đọc.
                }

                byteBuffer.clear(); //xoá sạch dữ liệu trong buffter đẽ sẵn sàn cho lần mới.
                result = fileChannel.read(byteBuffer);// set lại số type chưa đoc
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            fileChannel.close();
            fileInputStream.close();
        }
    }

}
