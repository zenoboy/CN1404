package com.example.cn1404;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mon_Bo_Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mon_bo);
        Button buttonQuayLai = findViewById(R.id.back);

        buttonQuayLai.setOnClickListener(new View.OnClickListener()
        {
            public void onClick (View view){
                Intent intent = new Intent(Mon_Bo_Activity.this, MonChinhActivity.class);

                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);

                startActivity(intent);
            }
        });
        Button cafeSuaButton = findViewById(R.id.BoPhoMai);
        cafeSuaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String recipeInstructions = "Công thức làm Bò Cuộn Phô Mai\n" +
                        "Nguyên liệu:\n" +
                        "300-400g thịt bò mỏng (loại thịt mềm như thăn, nạc)\n" +
                        "Phô mai (loại có thể phô mai dài, dễ cuốn)\n" +
                        "Hành tây\n" +
                        "Hành tím\n" +
                        "Ớt chuông (tùy chọn)\n" +
                        "Muối và tiêu\n" +
                        "Bột hành, bột tỏi (tùy chọn)\n" +
                        "Dầu olive hoặc dầu ăn (để chiên)\n" +
                        "Cách thực hiện:\n" +
                        "Bước 1: Chuẩn bị nguyên liệu:\n" +
                        "\n" +
                        "Thái thịt bò thành từng miếng mỏng và nhỏ hơn để dễ cuốn.\n" +
                        "Bước 2: Cắt phô mai thành từng thanh dài tương xứng với kích thước của miếng thịt bò.\n" +
                        "Hành tây và hành tím cắt thành sợi dài và mỏng.\n" +
                        "Ớt chuông thái lát mỏng nếu bạn sử dụng.\n" +
                        "Bước 3: Chế biến thịt bò:\n" +
                        "\n" +
                        "Ướp thịt bò với muối, tiêu, bột hành và bột tỏi (nếu dùng). Để thịt nghỉ trong khoảng 10-15 phút để gia vị thấm vào thịt.\n" +
                        "Bước 4: Cuộn bò với phô mai:\n" +
                        "\n" +
                        "Đặt một miếng thịt bò xuống mặt phẳng.\n" +
                        "Đặt thanh phô mai và một ít hành tây, hành tím, và ớt chuông (nếu có) lên trên miếng thịt.\n" +
                        "Cuộn chặt từ đỉnh xuống dưới, để chặt kín phô mai và nhân bên trong thịt bò.\n" +
                        "Bước 5: Chiên bò cuộn:\n" +
                        "\n" +
                        "Đun nóng dầu trong chảo.\n" +
                        "Cho bò cuộn vào chảo và chiên đến khi bề mặt thịt bò có màu vàng và phô mai bên trong tan chảy.\n" +
                        "Bước 6: Trình bày và thưởng thức:\n" +
                        "\n" +
                        "Đặt bò cuộn phô mai lên đĩa và trang trí theo sở thích của bạn, có thể kèm theo sốt cà chua hoặc sốt ướp bò nếu muốn. ";


                Intent intent = new Intent(Mon_Bo_Activity.this, RecipeDetailActivity.class);
                intent.putExtra("instructions", recipeInstructions);
                startActivity(intent);
            }
        });
        Button CapuchinoButton = findViewById(R.id.BoXao);
        CapuchinoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String recipeInstructions = "Cách làm Bò Xào lá nốt:\n" +
                        "Nguyên liệu:\n" +
                        "\n" +
                        "300g thịt bò, cắt thành sợi mảnh\n" +
                        "Lá lốt tươi, 30-40 lá (tùy vào số lượng và kích thước lá)\n" +
                        "2 muỗng canh dầu ăn\n" +
                        "1 muỗng canh nước mắm\n" +
                        "1 muỗng canh đường\n" +
                        "1 muỗng cà phê tiêu\n" +
                        "1 muỗng canh tỏi băm\n" +
                        "1 muỗng canh gừng băm\n" +
                        "Hành lá, rau sống và ớt để trang trí (tùy chọn)\n" +
                        "Cách thực hiện:\n" +
                        "\n" +
                        "Chuẩn bị lá lốt:\n" +
                        "\n" +
                        "Bước 1: Rửa sạch lá lốt, cắt bỏ cuống và để ráo.\n" +
                        "Nếu lá lốt lớn, bạn có thể cắt nhỏ để dễ cuốn.\n" +
                        "Bước 2: Chế biến thịt bò:\n" +
                        "\n" +
                        "Ướp thịt bò với nước mắm, đường, tiêu, tỏi băm và gừng băm. Để thịt ướp trong khoảng 15-30 phút.\n" +
                        "Bước 3: Cuộn lá lốt:\n" +
                        "\n" +
                        "Đặt lá lốt ra mặt phẳng, đặt một lớp thịt bò ở giữa, sau đó cuộn lá lốt quanh thịt bò.\n" +
                        "Gắn bằng que tre hoặc chỉ để giữ cho lá lốt không bung ra khi xào.\n" +
                        "Bước 4: Xào bò với lá lốt:\n" +
                        "\n" +
                        "Đun nóng dầu ăn trong chảo.\n" +
                        "Đặt các cuộn lá lốt đã cuộn vào chảo, xào cho đến khi lá lốt và thịt bò chín và có màu đẹp.\n" +
                        "Bước 5: Trang trí và thưởng thức:\n" +
                        "\n" +
                        "Trước khi tắt bếp, rắc hành lá và trang trí bằng rau sống, ớt theo khẩu vị cá nhân.\n" +
                        "Dùng nóng với cơm trắng.";
                Intent intent = new Intent(Mon_Bo_Activity.this, RecipeDetailActivity.class);
                intent.putExtra("instructions", recipeInstructions);
                startActivity(intent);
            }
        });
        Button BacSiu = findViewById(R.id.BoSotTieu);
        BacSiu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String recipeInstructions = "Công thức làm Bò Sốt Tiêu Đen:\n" +
                        " Nguyên liệu:\n" +
                        "\n" +
                        "500g thịt bò (sườn bò hoặc thịt bò tái), cắt thành sợi mảnh\n" +
                        "2-3 muỗng canh dầu ăn\n" +
                        "2 muỗng canh tiêu đen, nghiền nhuyễn\n" +
                        "1 muỗng canh nước tương\n" +
                        "1 muỗng canh nước mắm\n" +
                        "1 muỗng canh đường\n" +
                        "1 muỗng canh tương ớt (tùy chọn)\n" +
                        "1/2 chén nước\n" +
                        "2-3 tép tỏi, băm nhuyễn\n" +
                        "1 củ hành tây, cắt nhỏ\n" +
                        "Rau sống (cà rốt, bắp cải, cần tây) để trang trí (tùy chọn)\n" +
                        "Cách thực hiện:\n" +
                        "\n" +
                        "Bước 1: Chế biến thịt bò:\n" +
                        "\n" +
                        "Ướp thịt bò với nước tương, nước mắm, tiêu đen, đường, và tỏi băm. Để thịt ướp trong ít nhất 30 phút.\n" +
                        "Bước 2: Xào thịt bò:\n" +
                        "\n" +
                        "Đun nóng dầu ăn trong chảo.\n" +
                        "Xào tỏi và hành tây cho đến khi thơm.\n" +
                        "Thêm thịt bò vào chảo, xào đến khi thịt chín và có màu vàng đẹp.\n" +
                        "Bước 3: Nấu sốt tiêu đen:\n" +
                        "\n" +
                        "Thêm nước tương, nước mắm, tiêu đen, đường, tương ớt (nếu sử dụng), và nước vào chảo. Khuấy đều.\n" +
                        "Nấu sôi và thêm rau sống:\n" +
                        "\n" +
                        "Đun sôi và nấu cho đến khi sốt cô đặc hơn.\n" +
                        "Nếu muốn, bạn có thể thêm rau sống như cà rốt, bắp cải, cần tây vào sốt và trang trí lên trên thịt bò.\n" +
                        "Bước 4: Trang trí và thưởng thức:\n" +
                        "\n" +
                        "Trước khi tắt bếp, trang trí bữa ăn với rau sống (tùy chọn).\n" +
                        "Dùng nóng với cơm trắng. ";

                openRecipeDetailActivity(recipeInstructions);
            }
        });

        // Nút 4:
        Button TraDaoButton = findViewById(R.id.BoSotVang);
        TraDaoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String recipeInstructions = "Công thức làm Bò Sốt Vang:\n " +
                        "Nguyên liệu:\n" +
                        "\n" +
                        "500g thịt bò (có thể là thịt tái hoặc thịt sườn), cắt thành sợi mảnh\n" +
                        "1 chai rượu vang đỏ (khoảng 750ml)\n" +
                        "2-3 muỗng canh dầu ăn\n" +
                        "1 củ hành tây, băm nhỏ\n" +
                        "2-3 tép tỏi, băm nhuyễn\n" +
                        "2 muỗng canh nước tương\n" +
                        "1 muỗng canh đường\n" +
                        "1 muỗng cà phê tiêu\n" +
                        "Muối, tiêu, và gia vị khác theo khẩu vị\n" +
                        "Cách thực hiện:\n" +
                        "\n" +
                        "Bước 1: Chế biến thịt bò:\n" +
                        "\n" +
                        "Ướp thịt bò với nước tương, tiêu, và một ít dầu ăn. Để thịt ướp trong khoảng 15-30 phút.\n" +
                        "Bước 2: Nướng thịt bò:\n" +
                        "\n" +
                        "Nướng thịt bò trên chảo với lửa cao cho đến khi chúng có màu vàng đẹp.\n" +
                        "Bước 3: Chế biến sốt vang:\n" +
                        "\n" +
                        "Trong một nồi lớn, đun nóng dầu ăn, phi hành tây và tỏi cho đến khi thơm.\n" +
                        "Thêm rượu vang đỏ vào nồi và đun sôi. Nếu có thể, để rượu vang nấu chín và mất đi mùi cồn.\n" +
                        "Thêm nước tương, đường, tiêu, và gia vị khác nếu cần thiết. Khuấy đều.\n" +
                        "Bước 4: Nấu sốt và xào thịt:\n" +
                        "\n" +
                        "Đặt thịt bò nướng vào nồi sốt vang, đun nhỏ lửa và nấu cho thịt hấp thụ hương vị từ sốt vang.\n" +
                        "Nấu cho đến khi thịt mềm và sốt cô đặc hơn.\n" +
                        "Bước 5: Trang trí và thưởng thức:\n" +
                        "\n" +
                        "Trước khi tắt bếp, kiểm tra và điều chỉnh vị gia vị nếu cần thiết.\n" +
                        "Dùng nóng với cơm trắng hoặc bánh mì.";
                openRecipeDetailActivity(recipeInstructions);
            }
        });
    }

    private void openRecipeDetailActivity(String recipeInstructions) {
        Intent intent = new Intent(Mon_Bo_Activity.this, RecipeDetailActivity.class);
        intent.putExtra("instructions", recipeInstructions);
        startActivity(intent);
    }
}