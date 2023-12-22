package com.example.cn1404;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mon_Ca_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mon_ca);
        Button buttonQuayLai = findViewById(R.id.back);

        buttonQuayLai.setOnClickListener(new View.OnClickListener()
        {
            public void onClick (View view){
                Intent intent = new Intent(Mon_Ca_Activity.this, MonChinhActivity.class);

                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);

                startActivity(intent);
            }
        });
        Button CaNuongButton = findViewById(R.id.CaNuong);
        CaNuongButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String recipeInstructions = "Công thức làm món Cá Nướng Mỡ Hành \n" +
                        "Nguyên liệu:\n"+
                        "Cá (loại cá có thịt ngọt và dai như cá lóc, cá trê) đã làm sạch: khoảng 500g - 1kg tùy theo số lượng người ăn\n" +
                        "Mỡ hành: 100g\n" +
                        "Hành tím: 2 củ\n" +
                        "Hành lá: một ít\n" +
                        "Nước mắm, đường, tiêu, dầu ăn\n"+
                        "Cách thực hiện\n"+
                        "Bước 1: Chuẩn bị cá:\n" +
                        "Rửa cá sạch, để ráo nước.\n" +
                        "Sắc nát một ít hành tím và hành lá.\n " +
                        "Bước 2: Chế biến mỡ hành:\n" +
                        "Làm nóng mỡ hành trong chảo.\n" +
                        "Khi mỡ hành nóng, cho cá vào chảo rồi đảo đều cho cá chín, mỡ hành thấm đều vào cá.\n" +
                        "Nếu thấy cá chưa chín, bạn có thể thêm một ít nước để cá chín đều hơn. " +
                        "Bước 3: Nước mắm hành:\n" +
                        "Chuẩn bị nước mắm pha với đường, tiêu, và nước theo khẩu vị cá nhà bạn.\n " +
                        "Bước 4: Thưởng thức:\n" +
                        "Cá nướng mỡ hành khi chín đều và thơm phức.\n" +
                        "Đặt cá ra dĩa và rưới một ít nước mắm hành lên trên.\n" +
                        "Thưởng thức cùng cơm nóng và rau sống.\n" +
                        "Chúc bạn thành công và có bữa ăn ngon miệng! " ;

                Intent intent = new Intent(Mon_Ca_Activity.this, RecipeDetailActivity.class);
                intent.putExtra("instructions", recipeInstructions);
                startActivity(intent);
            }
        });
        Button CaKhoButton = findViewById(R.id.CaKho);
        CaKhoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String recipeInstructions = "Công thức làm Cá Kho Nghệ:\n " +
                        "Nguyên liệu:\n" +
                        "500g - 1kg cá (cá lóc, cá trê) đã làm sạch\n" +
                        "2-3 muỗng canh nước mắm\n" +
                        "1-2 muỗng canh đường\n" +
                        "1-2 muỗng cà phê nghệ bột\n" +
                        "Hành lá, hành tím, ớt (tùy chọn)\n" +
                        "Dầu ăn\n" +
                        "Nước dừa tươi (hoặc nước lọc)\n" +

                        "Cách thực hiện:\n" +
                        "\n" +
                        "Bước 1: Chế biến cá:\n" +
                        "Rửa cá sạch và cắt thành từng miếng vừa ăn.\n" +
                        "Xắt hành lá và hành tím thành những sợi nhỏ.\n" +
                        "Bước 2: Pha nước kho:\n" +
                        "Trong một tô nhỏ, trộn đều nước mắm, đường, và nghệ bột.\n" +
                        "Nếu bạn muốn món cá có vị cay, bạn có thể thêm ớt vào phần nước kho này.\n" +
                        "Bước 3: Kho cá:\n" +
                        "Đặt chảo lên bếp, cho một ít dầu ăn vào chảo và đun nóng.\n" +
                        "Khi dầu nóng, cho cá vào chiên một chút để cá có màu đẹp.\n" +
                        "Sau đó, đổ phần nước kho vào chảo, nêm nếm lại nếu cần thiết.\n" +
                        "Đậy nắp và nấu lửa nhỏ cho đến khi cá chín và nước sánh lại.\n" +

                        "Bước 4: Thưởng thức:\n" +
                        "\n" +
                        "Cá kho nghệ thường được thưởng thức nóng cùng với cơm trắng.\n" +
                        "Bạn có thể trang trí bằng hành lá và ớt để tạo điểm nhấn màu sắc và thơm ngon hơn.\n";


                Intent intent = new Intent(Mon_Ca_Activity.this, RecipeDetailActivity.class);
                intent.putExtra("instructions", recipeInstructions);
                startActivity(intent);
            }
        });
        Button CaChien = findViewById(R.id.CaChien);
        CaChien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String recipeInstructions = "Công thức làm Cá Chiên Sả Ớt: \n" +
                        "Nguyên liệu:\n" +
                        "500g cá (cá lóc, cá trê) đã làm sạch và cắt miếng vừa ăn\n" +
                        "2-3 củ sả\n" +
                        "3-4 quả ớt (tùy theo khẩu vị)\n" +
                        "2-3 muỗng canh dầu ăn\n" +
                        "1 muỗng canh nước mắm\n" +
                        "1 muỗng cà phê đường\n" +
                        "Hành lá, tỏi băm (tùy chọn)\n" +
                        "Muối, tiêu\n" +

                        "Cách thực hiện:\n" +

                        "Bước 1: Chế biến nguyên liệu:\n" +

                        "Sả: Băm sả nhỏ.\n" +
                        "Ớt: Băm ớt nhỏ hoặc cắt lát mỏng.\n" +
                        "Cá: Rửa sạch, lau khô và cắt thành từng miếng vừa ăn. Ưu tiên sử dụng cá có thịt ngon và dai như cá lóc, cá trê.\n" +
                        "\n" +
                        "Bước 2: Chế biến gia vị:\n" +
                        "Trộn sả băm, ớt băm, nước mắm, đường, muối, tiêu thành một hỗn hợp gia vị.\n" +
                        "Bước 3: Chiên cá:\n" +
                        "Đun nóng dầu ăn trong chảo.\n" +
                        "Khi dầu nóng, cho cá vào chiên đến khi cá chín và có màu vàng đẹp.\n" +
                        "Khi cá đã chín, đổ hỗn hợp gia vị vào chảo và đảo đều cá để gia vị thấm đều.\n" +

                        "Bước 4: Thưởng thức:\n" +
                        "Cá chiên sả ớt thường được thưởng thức nóng, có thể trang trí bằng hành lá và tỏi băm.\n" +
                        "Món này thường được ăn kèm với cơm nóng và một số loại rau sống như rau sống, dưa leo.\n" ;
                openRecipeDetailActivity(recipeInstructions);
            }
        });

        // Nút 4:
        Button CanhCaButton = findViewById(R.id.CanhCa);
        CanhCaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String recipeInstructions = "Công thức làm Canh Cá Nấu Măng: \n" +
                        "Nguyên liệu:\n" +

                        "300g măng tươi\n" +
                        "200g cá (cá lóc, cá trê) đã làm sạch và cắt miếng vừa ăn\n" +
                        "1 củ cà rốt, cắt sợi\n" +
                        "1 củ hành tím, cắt sợi\n" +
                        "1 củ hành lá, cắt nhỏ\n" +
                        "Gừng, tỏi, ớt (tùy chọn)\n" +
                        "Dầu ăn\n" +
                        "Nước dừa tươi (hoặc nước lọc)\n" +
                        "Nước mắm, muối, đường, tiêu\n" +
                        "Cách thực hiện:\n" +
                        "\n" +
                        "Bước 1: Chế biến nguyên liệu:\n" +
                        "\n" +
                        "Măng: Lột vỏ và cắt măng thành từng miếng vừa ăn.\n" +
                        "Cá: Rửa sạch và cắt thành từng miếng vừa ăn.\n" +
                        "Gừng và tỏi: Băm nhỏ.\n" +
                        "Ớt: Cắt lát mỏng (tùy chọn).\n" +

                        "Bước 2: Nấu canh:\n" +

                        "Đun nóng dầu ăn trong nồi.\n" +
                        "Khi dầu nóng, cho gừng và tỏi băm vào phi thơm.\n" +
                        "Tiếp theo, cho cá vào xào chín.\n" +
                        "Sau đó, đổ nước dừa (hoặc nước lọc) vào nồi, đun sôi.\n" +
                        "Khi nước sôi, cho măng vào nồi, nêm nếm với nước mắm, muối, đường và tiêu theo khẩu vị.\n" +
                        "Khi măng chín, thêm cà rốt và hành tím vào nồi, khuấy đều.\n" +
                        "Bước 3:Thưởng thức:\n" +

                        "Canh cá nấu măng thường được thưởng thức nóng, có thể trang trí bằng hành lá và ớt.\n" +
                        "Món canh này thường được ăn kèm với cơm nóng và một số loại rau sống như rau sống, dưa leo.\n";

                openRecipeDetailActivity(recipeInstructions);
            }
        });
    }

    private void openRecipeDetailActivity(String recipeInstructions) {
        Intent intent = new Intent(Mon_Ca_Activity.this, RecipeDetailActivity.class);
        intent.putExtra("instructions", recipeInstructions);
        startActivity(intent);
    }
}



