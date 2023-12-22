package com.example.cn1404;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mon_Ga_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mon_ga);
        Button buttonQuayLai = findViewById(R.id.back);

        buttonQuayLai.setOnClickListener(new View.OnClickListener()
        {
            public void onClick (View view){
                Intent intent = new Intent(Mon_Ga_Activity.this, MonChinhActivity.class);

                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);

                startActivity(intent);
            }
        });

        Button cafeSuaButton = findViewById(R.id.GaKhoNghe);
        cafeSuaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String recipeInstructions = "Công thức làm Gà Kho Nghệ: \nNguyên liệu:\n" +
                        "\n" +
                        "1 con gà (hoặc các phần gà mà bạn thích: cánh, đùi, ức, v.v.)\n" +
                        "2 muỗng canh nghệ bột\n" +
                        "2 muỗng canh dầu ăn\n" +
                        "1 muỗng canh nước mắm\n" +
                        "1 muỗng canh đường\n" +
                        "1 muỗng canh tỏi băm\n" +
                        "1 muỗng canh gừng băm\n" +
                        "1/2 muỗng cà phê tiêu\n" +
                        "2-3 cốc nước dừa tươi (hoặc nước lọc)\n" +
                        "Hành lá và ngò gai để trang trí (tùy chọn)\n" +
                        "Cách thực hiện:\n" +
                        "\n" +
                        "Bước 1 Chuẩn bị gà: Rửa sạch gà và cắt thành các miếng vừa ăn.\n" +
                        "\n" +
                        "Bước 2 Chế biến gia vị: Trong một tô, trộn chung nghệ bột với dầu ăn để tạo thành hỗn hợp nghệ.\n" +
                        "\n" +
                        "Bước 3 Phi thơm gia vị: Trong một nồi, đun nóng dầu ăn và phi thơm tỏi, gừng băm cho đến khi thơm.\n" +
                        "\n" +
                        "Bước 4 Nấu gà: Đặt gà vào nồi, chiên một lát để gà có màu vàng nhẹ.\n" +
                        "\n" +
                        "Bước 5 Thêm gia vị: Cho hỗn hợp nghệ đã trộn vào nồi, khuấy đều để gà được phủ gia vị.\n" +
                        "\n" +
                        "Bước 6 Nước dừa và nước mắm: Thêm nước dừa tươi và nước mắm vào nồi. Hạ lửa và nấu gà cho đến khi gà mềm và gia vị thấm đều, khoảng 30-40 phút. Thêm đường và tiêu vào nồi và khuấy đều.\n" +
                        "\n" +
                        "Bước 7 Chế biến thêm: Nếu muốn, bạn có thể thêm thêm các loại rau củ như khoai lang, cà rốt, hoặc nấm để làm cho món ăn thêm phong phú.\n" +
                        "\n" +
                        "Bước 8 Trang trí và thưởng thức: Trước khi tắt bếp, thêm hành lá và ngò gai để trang trí. Gắp gà ra đĩa và thưởng thức ấm áp với cơm trắng.\n" +
                        "\n" +
                        "Bước 9 Món gà kho nghệ này sẽ mang lại hương vị độc đáo và thơm ngon của nghệ cùng với sự ngọt ngào của nước dừa.";


                Intent intent = new Intent(Mon_Ga_Activity.this, RecipeDetailActivity.class);
                intent.putExtra("instructions", recipeInstructions);
                startActivity(intent);
            }
        });
        Button CapuchinoButton = findViewById(R.id.GaTan);
        CapuchinoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String recipeInstructions = "Cách làm Gà Tân Ngải cứu: \n Nguyên liệu:\n" +
                        "\n" +
                        "1 con gà (hoặc các phần gà mà bạn thích: cánh, đùi, ức, v.v.)\n" +
                        "1/2 chén ngải cứu tươi hoặc 2 muỗng canh ngải cứu khô\n" +
                        "2 muỗng canh nước mắm\n" +
                        "1 muỗng canh đường\n" +
                        "1 muỗng canh dầu ăn\n" +
                        "1 muỗng cà phê muối\n" +
                        "1 muỗng cà phê tiêu\n" +
                        "1 muỗng canh tỏi băm\n" +
                        "1 muỗng canh gừng băm\n" +
                        "2-3 cốc nước dừa tươi hoặc nước lọc\n" +
                        "Cách thực hiện:\n" +
                        "\n" +
                        "Bước 1 Chuẩn bị gà: Rửa sạch gà và cắt thành các miếng vừa ăn.\n" +
                        "\n" +
                        "Bước 2 Chế biến ngải cứu: Nếu bạn sử dụng ngải cứu tươi, hãy rửa sạch và cắt nhỏ. Nếu bạn sử dụng ngải cứu khô, hãy ngâm ngải cứu trong nước ấm cho đến khi nở và rửa sạch.\n" +
                        "\n" +
                        "Bước 3 Trộn gia vị: Trong một tô, trộn chung ngải cứu với nước mắm, đường, dầu ăn, muối, tiêu, tỏi băm và gừng băm để tạo thành hỗn hợp gia vị.\n" +
                        "\n" +
                        "Bước 4 Nấu gà: Đun nóng nước dừa hoặc nước lọc trong nồi, sau đó đặt gà vào nồi để nấu chín. Nếu gặp bọt, hãy hớt đi để nước sôi sạch hơn.\n" +
                        "\n" +
                        "Bước 5 Thêm gia vị: Khi gà đã chín mềm, thêm hỗn hợp gia vị vào nồi. Hâm nóng hỗn hợp trong khoảng 10-15 phút để gà thấm đều hương vị.\n" +
                        "\n" +
                        "Bước 6Chế biến thêm: Nếu muốn, bạn có thể thêm thêm các loại rau củ như cà rốt, khoai lang để làm cho món ăn thêm phong phú.\n" +
                        "\n" +
                        "Bước 7 Trang trí và thưởng thức: Trước khi tắt bếp, thêm hành lá và ngò gai để trang trí. Gắp gà ra đĩa và thưởng thức ấm áp với cơm trắng.\n" +
                        "\n" +
                        "Bước 8 Món gà tần ngải cứu sẽ mang lại một hương vị độc đáo, thơm ngon và bổ dưỡng từ ngải cứu.";
                Intent intent = new Intent(Mon_Ga_Activity.this, RecipeDetailActivity.class);
                intent.putExtra("instructions", recipeInstructions);
                startActivity(intent);
            }
        });
        Button BacSiu = findViewById(R.id.GaChien);
        BacSiu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String recipeInstructions = "Công thức làm Gà Chiên Sốt Me:\n Nguyên liệu:\n" +
                        "\n" +
                        "1 con gà (hoặc các phần gà mà bạn thích: cánh, đùi, ức, v.v.)\n" +
                        "1 chén nước mè (me) đen\n" +
                        "3-4 muỗng canh mật ong\n" +
                        "2 muỗng canh nước tương\n" +
                        "1 muỗng canh nước mắm\n" +
                        "1 muỗng cà phê tiêu\n" +
                        "1 muỗng canh dầu ăn\n" +
                        "1 muỗng canh tỏi băm\n" +
                        "1 muỗng canh gừng băm\n" +
                        "1/2 chén nước lọc\n" +
                        "Cách thực hiện:\n" +
                        "\n" +
                        "Bước 1 Chuẩn bị gà: Rửa sạch gà và cắt thành các miếng vừa ăn.\n" +
                        "\n" +
                        "Bước 2 Trộn gia vị: Trong một tô, trộn chung nước mè, mật ong, nước tương, nước mắm, tiêu, và nước lọc để tạo thành hỗn hợp sốt me.\n" +
                        "\n" +
                        "Bước 3 Chế biến gà: Trong một chảo, đun nóng dầu ăn, sau đó chiên gà cho đến khi chúng có màu vàng và chín đều. Hãy chú ý để không làm cháy quá mức.\n" +
                        "\n" +
                        "Bước 4 Làm sốt me: Trong một nồi, đun nóng dầu ăn và phi thơm tỏi và gừng băm. Sau đó, thêm hỗn hợp sốt me vào nồi. Khuấy đều và đun sôi.\n" +
                        "\n" +
                        "Bước 5 Nấu sốt me: Hạ lửa và để sốt me sôi nhỏ lửa khoảng 5-10 phút cho đến khi nó đặc lại và có độ nhớt.\n" +
                        "\n" +
                        "Bước 6 Trang trí và thưởng thức: Gắp gà ra khỏi chảo, đặt lên đĩa và rót sốt me lên trên. Trang trí bằng một ít hành lá hoặc gừng băm. Dùng ấm nóng với cơm trắng.";


                openRecipeDetailActivity(recipeInstructions);
            }
        });

        // Nút 4:
        Button TraDaoButton = findViewById(R.id.MuoiOt);
        TraDaoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String recipeInstructions = "Công thức làm Gà Nướng Muối Ớt :\n Nguyên liệu:\n" +
                        "\n" +
                        "1 con gà (hoặc các phần gà mà bạn thích: cánh, đùi, ức, v.v.)\n" +
                        "2-3 muỗng canh dầu ăn\n" +
                        "2-3 muỗng canh muối\n" +
                        "2-3 muỗng canh ớt bột (tùy vào khẩu vị của bạn)\n" +
                        "1 muỗng cà phê tiêu\n" +
                        "1 muỗng canh nước mắm\n" +
                        "2-3 muỗng canh mật ong hoặc đường (tùy chọn)\n" +
                        "Cách thực hiện:\n" +
                        "\n" +
                        "Bước 1 Chuẩn bị gà: Rửa sạch gà và lau khô bằng giấy có thể hấp thụ nước.\n" +
                        "\n" +
                        "Bước 2 Trộn gia vị: Trong một tô, trộn chung dầu ăn, muối, ớt bột, tiêu và nước mắm để tạo thành hỗn hợp gia vị.\n" +
                        "\n" +
                        "Bước 3 Nướng gà: Xát đều hỗn hợp gia vị lên toàn bộ bề mặt gà. Nếu có thể, để gà ngâm trong gia vị ít nhất 30 phút hoặc qua đêm trong tủ lạnh để hấp thụ hương vị.\n" +
                        "\n" +
                        "Bước 4 Nướng: Trước khi nướng, hâm nóng lò ở nhiệt độ 180-200 độ C. Đặt gà lên kệ nướng và nướng trong khoảng 45-60 phút hoặc cho đến khi gà chín và có màu vàng đẹp.\n" +
                        "\n" +
                        "Bước 5: Nước mật ong hoặc đường (tùy chọn): Trong giai đoạn cuối cùng của quá trình nướng, bạn có thể thoa mật ong hoặc đường lên bề mặt gà để tạo độ bóng và một lớp vị ngọt nhẹ.\n" +
                        "\n" +
                        "Bước 6 Thưởng thức: Để gà nghỉ trong vài phút trước khi cắt và thưởng thức. Bạn có thể dùng kèm với rau sống, nước mắm pha chua ngọt hoặc sốt ớt tương ăn kèm.";
                openRecipeDetailActivity(recipeInstructions);
            }
        });
    }

    private void openRecipeDetailActivity(String recipeInstructions) {
        Intent intent = new Intent(Mon_Ga_Activity.this, RecipeDetailActivity.class);
        intent.putExtra("instructions", recipeInstructions);
        startActivity(intent);
    }
}