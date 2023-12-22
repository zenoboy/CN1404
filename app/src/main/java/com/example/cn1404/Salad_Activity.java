package com.example.cn1404;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Salad_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salad);
        Button buttonQuayLai = findViewById(R.id.back);

        buttonQuayLai.setOnClickListener(new View.OnClickListener()
        {
            public void onClick (View view){
                Intent intent = new Intent(Salad_Activity.this, Khai_Vi_Activity.class);

                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);

                startActivity(intent);
            }
        });
        Button cafeSuaButton = findViewById(R.id.SaladCaHoi);
        cafeSuaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String recipeInstructions = "Công thức làm Salad Cá Hồi:\n" +
                        "Nguyên liệu:\n" +
                        "300-400g filet cá hồi (có thể là cá hồi tươi hoặc đã nướng chín)\n" +
                        "Rau xanh như rau diếp, rau mùi, rau răm\n" +
                        "Rau sống như rau xà lách, rau cải\n" +
                        "Cà chua\n" +
                        "Hành tây\n" +
                        "Hành tím\n" +
                        "Hạt điều hoặc hạt dẻ cười rang vàng\n" +
                        "Dầu ô liu\n" +
                        "Giấm balsamic hoặc giấm táo\n" +
                        "Muối và tiêu\n" +
                        "Cách thực hiện:\n" +
                        "Bước 1: Chế biến cá hồi:\n" +
                        "\n" +
                        "Nếu sử dụng cá hồi tươi, bạn có thể nướng cá hồi trong lò hoặc chiên trên chảo với ít dầu. Nếu đã có cá hồi nướng chín, bạn có thể cắt thành từng miếng nhỏ.\n" +
                        "Bước 2: Chuẩn bị nguyên liệu:\n" +
                        "\n" +
                        "Rau xanh và rau sống: Rửa sạch rau xanh và rau sống, để ráo nước và cắt nhỏ.\n" +
                        "Cà chua: Rửa sạch và cắt thành lát mỏng.\n" +
                        "Hành tây và hành tím: Cắt hành tây và hành tím thành lát mỏng.\n" +
                        "Bước 3: Tạo salad:\n" +
                        "\n" +
                        "Trong một tô lớn, trộn đều rau xanh, rau sống, cà chua, hành tây, hành tím và hạt điều hoặc hạt dẻ cười.\n" +
                        "Bước 4: Thêm cá hồi và gia vị:\n" +
                        "\n" +
                        "Đặt các miếng cá hồi đã nướng hoặc đã chín lên trên lớp salad.\n" +
                        "Nhỏ dầu ô liu và giấm balsamic hoặc giấm táo lên trên salad để tạo hương vị. Nêm muối và tiêu theo khẩu vị riêng của bạn.\n" +
                        "Bước 5: Trình bày và thưởng thức:\n" +
                        "\n" +
                        "Trình bày salad cá hồi trên đĩa hoặc tô rồi thưởng thức ngay khi salad còn tươi ngon nhất.";

                Intent intent = new Intent(Salad_Activity.this, RecipeDetailActivity.class);
                intent.putExtra("instructions", recipeInstructions);
                startActivity(intent);
            }
        });
        Button CapuchinoButton = findViewById(R.id.SaladUcGa);
        CapuchinoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String recipeInstructions = "Công thức Salad Ức Gà:\n " +
                        "Nguyên liệu:\n" +
                        "2-3 ức gà (đã nấu chín và cắt thành miếng)\n" +
                        "Rau xanh như rau xà lách, rau cải, rau mùi, rau răm\n" +
                        "Cà chua\n" +
                        "Hành tây\n" +
                        "Hành tím\n" +
                        "Hạt hướng dương hoặc hạt dẻ cười rang vàng\n" +
                        "Sốt salad (có thể là sốt ranch, sốt mayonnaise hoặc sốt balsamic)\n" +
                        "Cách thực hiện:\n" +
                        "Bước 1: Chuẩn bị ức gà:\n" +
                        "\n" +
                        "Nấu ức gà trong nước sôi hoặc nướng cho đến khi chín. Sau đó, cắt ức gà thành miếng vừa ăn.\n" +
                        "Bước 2: Chuẩn bị nguyên liệu:\n" +
                        "\n" +
                        "Rau xanh: Rửa sạch rau xanh và để ráo nước.\n" +
                        "Cà chua: Rửa sạch và cắt thành lát mỏng.\n" +
                        "Hành tây và hành tím: Cắt hành tây và hành tím thành lát mỏng.\n" +
                        "Bước 3: Tạo salad:\n" +
                        "\n" +
                        "Trong một tô lớn, trộn đều rau xanh, cà chua, hành tây và hành tím. Bạn có thể thêm thêm các loại rau khác tùy theo sở thích.\n" +
                        "Bước 4: Thêm ức gà và hạt:\n" +
                        "\n" +
                        "Đặt miếng ức gà đã nấu lên trên lớp salad.\n" +
                        "Rắc hạt hướng dương hoặc hạt dẻ cười rang vàng lên trên salad.\n" +
                        "Bước 5: Thêm sốt và trình bày:\n" +
                        "\n" +
                        "Nhỏ sốt salad (ranch, mayonnaise, balsamic, hoặc loại sốt mà bạn thích) lên trên salad và thưởng thức ";

                Intent intent = new Intent(Salad_Activity.this, RecipeDetailActivity.class);
                intent.putExtra("instructions", recipeInstructions);
                startActivity(intent);
            }
        });
        Button BacSiu = findViewById(R.id.SaladTraiCay);
        BacSiu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String recipeInstructions = "Công thức làm Salad Trái Cây:\n " +
                        "Nguyên liệu:\n" +
                        "2-3 loại trái cây tươi (ví dụ: dưa hấu, dưa lưới, kiwi, cam, táo, nho, dứa, dâu, dừa, chuối)\n" +
                        "1-2 quả cam, chanh hoặc dấm trái cây (tùy chọn)\n" +
                        "Một ít lá bạc hà hoặc lá bắp cải tươi (tùy chọn)\n" +
                        "Một ít mật ong hoặc đường (tùy chọn)\n" +
                        "Hạt dẻ cười, hạt hướng dương hoặc hạt hạnh nhân rang vàng (tùy chọn)\n" +
                        "Một ít lá rau thơm như húng quế hoặc bạc hà (tùy chọn)\n" +
                        "Cách thực hiện:\n" +
                        "Bước 1: Chuẩn bị trái cây:\n" +
                        "\n" +
                        "Rửa sạch trái cây và cắt thành từng miếng hoặc lát mỏng tùy theo loại trái cây. Loại bỏ hạt, vỏ hoặc phần cứng nếu cần.\n" +
                        "Bước 2: Trộn trái cây:\n" +
                        "\n" +
                        "Đặt tất cả các loại trái cây đã chuẩn bị vào một tô lớn.\n" +
                        "Bước 3: Pha sốt (tùy chọn):\n" +
                        "\n" +
                        "Nếu muốn có một lớp phủ hoặc một vị chua ngọt hơn, bạn có thể pha chế một ít nước chanh hoặc cam với một ít mật ong hoặc đường.\n" +
                        "Bước 4: Trình bày:\n" +
                        "\n" +
                        "Cho trái cây vào tô trình bày hoặc đĩa, rồi rưới lớp nước cam hoặc nước chanh pha chế lên trên.\n" +
                        "Bước 5: Thêm hạt và rau thơm (tùy chọn):\n" +
                        "\n" +
                        "Rắc hạt dẻ cười, hạt hướng dương hoặc hạt hạnh nhân rang vàng lên trên salad trái cây để tăng thêm độ giòn.\n" +
                        "Nếu bạn muốn, thêm một ít lá rau thơm như húng quế hoặc bạc hà để tạo thêm hương vị tươi mới cho salad và thưởng thức";


                openRecipeDetailActivity(recipeInstructions);
            }
        });

        // Nút 4:
        Button TraDaoButton = findViewById(R.id.SaladThitBo);
        TraDaoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String recipeInstructions = "Công thức làm Salad Thịt Bò:\n " +
                        "Nguyên liệu:\n" +
                        "300-400g thịt bò (loại thịt mềm như thăn, bắp, nạc)\n" +
                        "Rau xanh như rau xà lách, rau cải, rau mùi, rau răm\n" +
                        "Rau sống như cà chua, cà rốt, dưa leo, ớt chuông\n" +
                        "Hành tây\n" +
                        "Hành tím\n" +
                        "Hạt điều hoặc hạt dẻ cười rang vàng (tùy chọn)\n" +
                        "Dầu ô liu hoặc dầu hạt hướng dương\n" +
                        "Giấm táo hoặc giấm balsamic\n" +
                        "Muối, tiêu, gia vị tổng hợp\n" +
                        "Sốt salad (tùy chọn)\n" +
                        "Cách thực hiện:\n" +
                        "Bước 1: Chế biến thịt bò:\n" +
                        "\n" +
                        "Nếu có thể, nướng thịt bò trên lò hoặc chiên trên chảo với ít dầu cho đến khi chín hoặc vừa chín tới.\n" +
                        "Khi thịt đã chín, cắt thịt thành miếng mỏng, có thể dễ dàng phục vụ trên salad.\n" +
                        "Bước 2: Chuẩn bị nguyên liệu:\n" +
                        "\n" +
                        "Rau xanh: Rửa sạch rau xanh và để ráo nước.\n" +
                        "Rau sống: Cắt cà chua, cà rốt, dưa leo, ớt chuông và các loại rau sống khác thành lát mỏng hoặc miếng nhỏ.\n" +
                        "Hành tây và hành tím: Cắt hành tây và hành tím thành lát mỏng.\n" +
                        "Bước 3: Tạo salad:\n" +
                        "\n" +
                        "Trộn đều rau xanh, rau sống, hành tây và hành tím trong một tô lớn hoặc tô salad.\n" +
                        "Bước 4: Thêm thịt bò và hạt:\n" +
                        "\n" +
                        "Đặt miếng thịt bò đã nấu lên trên lớp salad.\n" +
                        "Rắc hạt điều hoặc hạt dẻ cười rang vàng lên trên salad để tạo thêm độ giòn.\n" +
                        "Bước 5: Pha sốt và trình bày:\n" +
                        "\n" +
                        "Pha chế sốt salad theo khẩu vị cá nhân hoặc sử dụng các loại sốt sẵn có.\n" +
                        "Rưới sốt salad lên trên salad bò hoặc cung cấp riêng cho mỗi người và thưởng thức.";

                openRecipeDetailActivity(recipeInstructions);
            }
        });
    }

    private void openRecipeDetailActivity(String recipeInstructions) {
        Intent intent = new Intent(Salad_Activity.this, RecipeDetailActivity.class);
        intent.putExtra("instructions", recipeInstructions);
        startActivity(intent);
    }
}
