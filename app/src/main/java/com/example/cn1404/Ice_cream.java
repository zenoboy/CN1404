package com.example.cn1404;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ice_cream extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ice_cream);
        Button buttonQuayLai = findViewById(R.id.back);

        buttonQuayLai.setOnClickListener(new View.OnClickListener()
        {
            public void onClick (View view){
                Intent intent = new Intent(Ice_cream.this, Trang_MiengActivity.class);

                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);

                startActivity(intent);
            }
        });

        Button kemChuoiButton = findViewById(R.id.kemchuoi);
        kemChuoiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String recipeInstructions = "Công thức làm kem chuối: \n" +
                        "Nguyên liệu:\n"+
                        "4-5 chuối chín, cắt lát và đông lạnh trước đó\n" +
                        "1/2 - 3/4 cốc đường\n" +
                        "1/2 - 3/4 cốc sữa tươi hoặc sữa đặc\n" +
                        "1/2 - 3/4 cốc kem tươi (nếu có)\n" +
                        "1-2 thìa cà phê chiết xuất vani (tuỳ chọn)\n"+
                        "Cách thực hiện\n"+
                        "Bước 1: Chuẩn bị chuối: Lột vỏ và cắt chuối thành miếng nhỏ.\n " +
                        "Bước 2: Làm kem: Trong một tô lớn, đánh nhẹ kem tươi cho đến khi nó đặc chất. " +
                        "Nếu muốn, bạn có thể thêm đường vào để ngọt hơn và vani chiết xuất để tăng hương vị." + " \n " +
                        "Bước 3: Thêm chuối: Thêm chuối đã chuẩn bị vào tô kem và khuấy nhẹ để chúng được phủ đều bởi kem \n " +
                        "Bước 4: Đông lạnh: Đặt hỗn hợp vào máy làm kem hoặc tủ lạnh và đông lạnh theo hướng dẫn của máy làm kem hoặc trong khoảng 4-6 giờ, hoặc cho đến khi hỗn hợp đông đặc. " ;

                Intent intent = new Intent(Ice_cream.this, RecipeDetailActivity.class);
                intent.putExtra("instructions", recipeInstructions);
                startActivity(intent);
            }
        });
        Button kemboButton = findViewById(R.id.kembo);
        kemboButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String recipeInstructions = "Công thức làm kem Bơ:\n " +
                        "Nguyên liệu:\n" +
                        "2 ốc bơ chín mềm\n" +
                        "1 cốc đường (hoặc theo khẩu vị)\n" +
                        "2 cốc kem tươi (cream)\n" +
                        "1 muỗng cà phê vani chiết xuất (tùy chọn)\n" +
                        "Cách thực hiện:\n" +
                        "\n" +
                        "Bước 1: Chuẩn bị bơ\n" +
                        "\n" +
                        "Lột vỏ và cắt bơ thành miếng nhỏ.\n" +
                        "Bước 2: Làm hỗn hợp kem bơ\n" +
                        "\n" +
                        "Trong một tô lớn, đánh nhẹ kem tươi cho đến khi nó đặc chất.\n" +
                        "Thêm đường vào và tiếp tục đánh cho đến khi đường tan hết và hỗn hợp trở nên mịn màng.\n" +
                        "Thêm vani chiết xuất và khuấy đều.\n" +
                        "Bước 3: Thêm bơ\n" +
                        "\n" +
                        "Thêm bơ đã chuẩn bị vào tô kem và khuấy nhẹ để chúng được phủ đều bởi kem.\n" +
                        "Bước 4: Đông lạnh\n" +
                        "\n" +
                        "Đặt hỗn hợp vào máy làm kem hoặc tủ lạnh và đông lạnh theo hướng dẫn của máy làm kem hoặc trong khoảng 4-6 giờ, hoặc cho đến khi hỗn hợp đông đặc. " ;

                Intent intent = new Intent(Ice_cream.this, RecipeDetailActivity.class);
                intent.putExtra("instructions", recipeInstructions);
                startActivity(intent);
            }
        });
        Button kemvali = findViewById(R.id.valli);
        kemvali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String recipeInstructions = "Công thức làm kem Vani: Nguyên liệu:\n" +
                        "2 cốc kem tươi (cream)\n" +
                        "3/4 cốc đường (hoặc theo khẩu vị)\n" +
                        "1 muỗng cà phê vani chiết xuất\n" +
                        "4 lòng đỏ trứng (tùy chọn, để làm kem trứng)\n" +
                        "Cách thực hiện:\n" +
                        "\n" +
                        "Bước 1: Làm hỗn hợp cơ bản:\n" +
                        "\n" +
                        "Trong một tô lớn, đánh nhẹ kem tươi cho đến khi nó đặc chất.\n" +
                        "Bước 2: Thêm đường vào và tiếp tục đánh cho đến khi đường tan hết và hỗn hợp trở nên mịn màng.\n" +
                        "Bước 3: Thêm vani:\n" +
                        "\n" +
                        "Thêm vani chiết xuất vào hỗn hợp kem và khuấy đều. Nếu bạn sử dụng trứng, thêm lòng đỏ trứng và khuấy đến khi hỗn hợp đồng nhất.\n" +
                        "Bước 4: Đông lạnh:\n" +
                        "\n" +
                        "Đặt hỗn hợp vào máy làm kem hoặc tủ lạnh và đông lạnh theo hướng dẫn của máy làm kem hoặc trong khoảng 4-6 giờ, hoặc cho đến khi hỗn hợp đông đặc.\n" +
                        "Dùng:\n" +
                        "\n" +
                        "Bước 5:Sau khi kem đã lạnh đủ, bạn có thể dùng ngay hoặc lưu trữ trong tủ lạnh.";
                openRecipeDetailActivity(recipeInstructions);
            }
        });

        // Nút 4:
        Button kemCafeButton = findViewById(R.id.socola);
        kemCafeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String recipeInstructions = "Công thức làm kem Socola: \n" +
                        "Nguyên liệu:\n" +
                        "\n" +
                        "2 cốc kem tươi (cream)\n" +
                        "1 cốc đường (hoặc theo khẩu vị)\n" +
                        "1/2 cốc cacao không đường\n" +
                        "1 muỗng canh vani chiết xuất\n" +
                        "Cách thực hiện:\n" +
                        "\n" +
                        "Bước 1: Làm hỗn hợp cơ bản:\n" +
                        "\n" +
                        "Trong một tô lớn, đánh nhẹ kem tươi cho đến khi nó đặc chất.\n" +
                        "Bước 2: Thêm đường vào và tiếp tục đánh cho đến khi đường tan hết và hỗn hợp trở nên mịn màng.\n" +
                        "Bước 3: Thêm cacao:\n" +
                        "\n" +
                        "Thêm cacao vào hỗn hợp kem và khuấy đều cho đến khi cacao hòa quện vào kem một cách đồng đều.\n" +
                        "Bước 4: Thêm vani:\n" +
                        "\n" +
                        "Thêm vani chiết xuất vào hỗn hợp và khuấy đều.\n" +
                        "Bước 5: Đông lạnh:\n" +
                        "\n" +
                        "Đặt hỗn hợp vào máy làm kem hoặc tủ lạnh và đông lạnh theo hướng dẫn của máy làm kem hoặc trong khoảng 4-6 giờ, hoặc cho đến khi hỗn hợp đông đặc.";
                openRecipeDetailActivity(recipeInstructions);
            }
        });
    }

    private void openRecipeDetailActivity(String recipeInstructions) {
        Intent intent = new Intent(Ice_cream.this, RecipeDetailActivity.class);
        intent.putExtra("instructions", recipeInstructions);
        startActivity(intent);
    }
    }
