package com.example.cn1404;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mon_Sup_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mon_sup);
        Button buttonQuayLai = findViewById(R.id.back);

        buttonQuayLai.setOnClickListener(new View.OnClickListener()
        {
            public void onClick (View view){
                Intent intent = new Intent(Mon_Sup_Activity.this, Khai_Vi_Activity.class);

                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);

                startActivity(intent);
            }
        });
        Button cafeSuaButton = findViewById(R.id.SupGa);
        cafeSuaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String recipeInstructions = "Công thức làm Súp gà:\n" +
                        "Nguyên liệu:\n" +
                        "\n" +
                        "500g thịt gà (có thể dùng cả thân gà hoặc chỉ ngực gà tùy ý)\n" +
                        "1 củ hành tây, băm nhuyễn\n" +
                        "2 củ cà rốt, thái lát hoặc cắt nhỏ\n" +
                        "2-3 tép tỏi, băm nhuyễn\n" +
                        "2 lít nước\n" +
                        "1 thìa canh dầu oliu hoặc dầu thực vật\n" +
                        "1 thìa cà phê hạt nêm (nếu muốn)\n" +
                        "Muối, tiêu, gia vị theo khẩu vị\n" +
                        "Cách thực hiện:\n" +
                        "\n" +
                        "Bước 1: Đầu tiên, hãy đun nóng dầu trong một nồi lớn. Khi dầu nóng, cho hành tây và tỏi vào xào cho đến khi thơm.\n" +
                        "Bước 2: Tiếp theo, thêm thịt gà vào nồi và xào đều cho đến khi thịt chuyển sang màu trắng.\n" +
                        "Bước 3: Sau đó, đổ nước vào nồi và đun sôi. Khi nước sôi, hạ lửa và nấu súp trong khoảng 30-40 phút để thịt gà chín mềm.\n" +
                        "Bước 4: Trong khi đun sôi, bạn có thể thêm cà rốt vào nồi để cùng nấu chung với thịt.\n" +
                        "Bước 5: Khi thịt và cà rốt đã chín, hãy nêm gia vị theo khẩu vị của bạn, có thể thêm muối, tiêu, hạt nêm để tăng hương vị.\n" +
                        "Bước 6: Khi súp đã chín, tắt bếp và thưởng thức. Bạn có thể thêm rau thơm như húng quế, ngò gai để tăng thêm mùi vị cho súp trước khi thưởng thức." ;

                Intent intent = new Intent(Mon_Sup_Activity.this, RecipeDetailActivity.class);
                intent.putExtra("instructions", recipeInstructions);
                startActivity(intent);
            }
        });
        Button CapuchinoButton = findViewById(R.id.SupLuon);
        CapuchinoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String recipeInstructions = "Công thức Súp lươn:\n " +
                        "Nguyên liệu:\n" +
                        "500g lươn tươi\n" +
                        "Hành, tỏi, ớt, gừng\n" +
                        "1 củ hành tây\n" +
                        "2 củ cà rốt\n" +
                        "Cà chua\n" +
                        "Rau thơm như rau mùi, ngò gai\n" +
                        "Muối, tiêu, gia vị tổng hợp\n" +
                        "Nước dùng cá hoặc nước dùng rau củ\n" +
                        "Bún (tùy chọn)\n" +
                        "Cách thực hiện:\n" +
                        "Bước 1: Chuẩn bị lươn:\n" +
                        "\n" +
                        "Rửa sạch lươn và thái thành từng miếng vừa ăn.\n" +
                        "Bước 2: Chế biến nguyên liệu:\n" +
                        "\n" +
                        "Xào hành, tỏi, ớt và gừng cho đến khi thơm.\n" +
                        "Thêm củ hành tây và cà rốt vào chảo, xào cho đến khi chúng mềm.\n" +
                        "Bước 3: Nấu nước dùng:\n" +
                        "\n" +
                        "Cho nước dùng cá hoặc nước dùng rau củ vào nồi, đun sôi.\n" +
                        "Khi nước sôi, cho lươn vào nồi, nêm gia vị với muối, tiêu, gia vị tổng hợp theo khẩu vị cá nhân. Đun sôi và tiếp tục đun trong khoảng 10-15 phút cho đến khi lươn chín.\n" +
                        "Bước 4: Thêm cà chua và rau thơm:\n" +
                        "\n" +
                        "Thêm cà chua và rau thơm như rau mùi, ngò gai vào nồi. Đun sôi trong khoảng 5-7 phút nữa cho các thành phần khác chín đều và tạo hương vị cho súp.\n" +
                        "Bước 5: Trình bày:\n" +
                        "\n" +
                        "Trình bày súp lươn bằng cách đổ vào tô, có thể kèm theo bún nếu muốn và thưởng thức:" ;

                Intent intent = new Intent(Mon_Sup_Activity.this, RecipeDetailActivity.class);
                intent.putExtra("instructions", recipeInstructions);
                startActivity(intent);
            }
        });
        Button BacSiu = findViewById(R.id.SupGanBo);
        BacSiu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String recipeInstructions = "Công thức làm Súp Gân Bò:\n" +
                        "Nguyên liệu:\n" +
                        "500g gân bò\n" +
                        "1 củ hành tây\n" +
                        "2 củ cà rốt\n" +
                        "Gừng và hành tím tươi\n" +
                        "1-2 quả cà chua\n" +
                        "1 củ cần tây\n" +
                        "Muối, tiêu, gia vị tổng hợp\n" +
                        "Nước dùng bò hoặc nước dùng phở\n" +
                        "Bún (tùy chọn)\n" +
                        "Cách thực hiện:\n" +
                        "Chuẩn bị gân bò:\n" +
                        "\n" +
                        "Bước 1: Đầu tiên, hãy ngâm gân bò trong nước lạnh khoảng 1-2 giờ để loại bỏ máu và tạp chất.\n" +
                        "Đem gân bò đun sôi trong nước khoảng 5-10 phút, sau đó rửa sạch lại bằng nước lạnh.\n" +
                        "Bước 2: Nấu súp:\n" +
                        "\n" +
                        "Cho gân bò vào nồi nước dùng hoặc nước phở, đun sôi rồi giảm lửa để nấu chín gân bò trong khoảng 1-1.5 giờ. " +
                        "Trong quá trình nấu, bạn có thể thêm hành tây, gừng và một ít muối để tăng hương vị.\n" +
                        "Bước 3: Thêm gia vị:\n" +
                        "\n" +
                        "Khi gân bò đã mềm, thêm cà rốt, cần tây, cà chua và nêm gia vị theo khẩu vị cá nhân (muối, tiêu, gia vị tổng hợp). " +
                        "Tiếp tục nấu cho đến khi các nguyên liệu khác chín mềm.\n" +
                        "Bước 4: Trình bày:\n" +
                        "\n" +
                        "Khi súp đã chín, bạn có thể trình bày bằng cách xếp bún vào tô, " +
                        "rưới nước súp gân bò lên trên và thêm ít hành tím tươi và gừng đã cắt nhỏ để tăng hương vị và màu sắc và thưởng thức:";


                openRecipeDetailActivity(recipeInstructions);
            }
        });

        // Nút 4:
        Button TraDaoButton = findViewById(R.id.SupCaHoi);
        TraDaoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String recipeInstructions = "Công thức làm Súp cá hồi:\n" +
                        "Nguyên liệu:\n" +
                        "500g cá hồi tươi (có thể sử dụng cả thịt và xương cá để nấu nước dùng)\n" +
                        "1 củ hành tây\n" +
                        "2 củ cà rốt\n" +
                        "Gừng và hành tím tươi\n" +
                        "1-2 quả cà chua\n" +
                        "Rau thơm như rau mùi, ngò gai\n" +
                        "Muối, tiêu, gia vị tổng hợp\n" +
                        "Nước dùng cá hoặc nước dùng rau củ\n" +
                        "Bún (tùy chọn)\n" +
                        "Cách thực hiện:\n" +
                        "Bước 1: Chuẩn bị cá hồi:\n" +
                        "\n" +
                        "Đầu tiên, nếu có thể, bạn có thể sử dụng thịt cá hồi để nấu súp và giữ lại xương cá để nấu nước dùng. Nếu không, có thể dùng xương cá cũng được.\n" +
                        "Đem cá hồi đun sôi trong nước khoảng 5-10 phút để làm sạch và loại bỏ mùi tanh.\n" +
                        "Bước 2: Nấu nước dùng:\n" +
                        "\n" +
                        "Cho xương cá hoặc thịt cá đã làm sạch vào nồi với nước dùng cá hoặc nước dùng rau củ. Đun sôi và sau đó giảm lửa để nước sôi nhẹ trong khoảng 30-40 phút để lấy hết hương vị của cá.\n" +
                        "Bước 3: Thêm gia vị và nguyên liệu:\n" +
                        "\n" +
                        "Thêm hành tây, cà rốt, gừng và cà chua vào nước dùng. Nêm gia vị theo khẩu vị cá nhân (muối, tiêu, gia vị tổng hợp).\n" +
                        "Tiếp tục nấu cho đến khi các nguyên liệu khác chín mềm và nước súp thấm hết hương vị của cá và rau củ.\n" +
                        "Bước 4: Thêm cá hồi và rau thơm:\n" +
                        "\n" +
                        "Khi nước súp đã thấm hết hương vị, bạn có thể thêm thịt cá hồi đã làm sạch vào nồi để nấu chín, không nên nấu quá lâu để tránh cá trở nên khô và cứng.\n" +
                        "Thêm rau thơm như rau mùi, ngò gai vào nồi trước khi tắt bếp để tạo hương vị thơm ngon cho súp.\n" +
                        "Bước 5: Trình bày:\n" +
                        "\n" +
                        "Trình bày súp cá hồi bằng cách đổ vào tô, có thể kèm theo bún nếu bạn muốn và thưởng thức:";

                openRecipeDetailActivity(recipeInstructions);
            }
        });
    }

    private void openRecipeDetailActivity(String recipeInstructions) {
        Intent intent = new Intent(Mon_Sup_Activity.this, RecipeDetailActivity.class);
        intent.putExtra("instructions", recipeInstructions);
        startActivity(intent);
    }
}
