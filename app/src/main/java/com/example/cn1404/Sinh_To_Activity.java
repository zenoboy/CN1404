package com.example.cn1404;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sinh_To_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sinh_to);
        Button buttonsinhto = findViewById(R.id.back);

        buttonsinhto.setOnClickListener(new View.OnClickListener()
        {
            public void onClick (View view){
                Intent intent = new Intent(Sinh_To_Activity.this, douongactivity.class);

                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);

                startActivity(intent);
            }
        });
        Button cafeSuaButton = findViewById(R.id.Sapoche);
        cafeSuaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String recipeInstructions = "Công thức làm Cafe Sữa Nóng: \nNguyên liệu:\n" +
                        "\n" +
                        "2 quả sapoche chín mềm, lột vỏ và hạt\n" +
                        "1-2 quả chuối chín\n" +
                        "1/2 chén sữa tươi (hoặc sữa đậu nành, sữa hạ đường)\n" +
                        "Đá bào (tùy chọn)\n" +
                        "Đường hoặc mật ong để làm ngọt (nếu cần)\n" +
                        "Hướng dẫn:\n" +
                        "\n" +
                        "Chuẩn bị nguyên liệu: Lột vỏ và hạt của quả sapoche, cắt thành từng miếng nhỏ. Chuối cũng cần được bóc vỏ và cắt thành đoạn nhỏ.\n" +
                        "\n" +
                        "Đánh bát sinh tố: Đặt sapoche, chuối, và sữa vào bát sinh tố hoặc máy xay sinh tố.\n" +
                        "\n" +
                        "Xay sinh tố: Sử dụng máy xay sinh tố để xay nhuyễn hỗn hợp. Nếu bạn muốn có độ lạnh, thêm đá bào vào hỗn hợp và xay tiếp.\n" +
                        "\n" +
                        "Kiểm tra độ ngọt: Nếu bạn muốn thêm đường hoặc mật ong để làm ngọt hơn, hãy thêm dần và khuấy đều. Kiểm tra và điều chỉnh theo khẩu vị của bạn.\n" +
                        "\n" +
                        "Rót vào cốc và thưởng thức: Rót sinh tố vào cốc, thêm đá bào (nếu muốn) và thưởng thức ngay.\n" +
                        "Nguyên liệu:\n" +
                        "2-3 muỗng cà phê bột\n" +
                        "2-3 muỗng đường (tùy khẩu vị)\n" +
                        "2-3 muỗng nước nóng\n" +
                        "150ml sữa đặc hoặc sữa tươi\n" +
                        "Một chút cacao bột (tuỳ chọn)\n" +
                        "Cách làm:\n" +
                        "Pha cà phê: Đặt bột cà phê vào cốc. Đổ nước nóng vào bột cà phê và khuấy đều cho bột cà phê tan hoàn toàn.\n" +
                        "\n" +
                        "Pha sữa: Trong một nồi nhỏ, hâm nóng sữa đặc hoặc sữa tươi trên lửa nhỏ. Đảm bảo sữa không sôi.\n" +
                        "\n" +
                        "Pha chung: Sau khi cà phê đã tan, đổ sữa đang hâm nóng vào cốc chứa cà phê.\n" +
                        "\n" +
                        "Thêm đường: Thêm đường theo khẩu vị cá nhân vào cốc cà phê sữa. Khuấy cho đến khi đường tan hoàn toàn.\n" +
                        "\n" +
                        "Trang trí (tuỳ chọn): Bạn có thể rắc một ít bột cacao lên trên cốc Café Sữa Nóng để làm điểm nhấn hoặc để tạo hình trang trí.\n" +
                        "\n" +
                        "Thưởng thức: Café Sữa Nóng sẵn sàng để thưởng thức";


                Intent intent = new Intent(Sinh_To_Activity.this, RecipeDetailActivity.class);
                intent.putExtra("instructions", recipeInstructions);
                startActivity(intent);
            }
        });
        Button CapuchinoButton = findViewById(R.id.DauTay);
        CapuchinoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String recipeInstructions = "Cách làm sinh Dâu tây: \n Nguyên liệu:\n" +
                        "\n" +
                        "1 chén dâu tây tươi hoặc dâu tây đông lạnh\n" +
                        "1 chuỗi chuối chín\n" +
                        "1/2 chén sữa tươi (hoặc sữa đậu nành, sữa hạ đường)\n" +
                        "1/2 chén đá bào (tùy chọn)\n" +
                        "Đường hoặc mật ong để làm ngọt (nếu cần)\n" +
                        "Hướng dẫn:\n" +
                        "\n" +
                        "Chuẩn bị nguyên liệu: Rửa sạch dâu tây và chuối. Cắt chuối thành đoạn nhỏ.\n" +
                        "\n" +
                        "Đánh bát sinh tố: Đặt dâu tây, chuối, và sữa vào bát sinh tố hoặc máy xay sinh tố.\n" +
                        "\n" +
                        "Xay sinh tố: Sử dụng máy xay sinh tố để xay nhuyễn hỗn hợp. Nếu bạn muốn có độ lạnh, thêm đá bào vào hỗn hợp và xay tiếp.\n" +
                        "\n" +
                        "Kiểm tra độ ngọt: Nếu bạn muốn thêm đường hoặc mật ong để làm ngọt hơn, hãy thêm dần và khuấy đều. Kiểm tra và điều chỉnh theo khẩu vị của bạn.\n" +
                        "\n" +
                        "Rót vào cốc và thưởng thức: Rót sinh tố vào cốc, thêm đá bào (nếu muốn) và thưởng thức ngay.";
                Intent intent = new Intent(Sinh_To_Activity.this, RecipeDetailActivity.class);
                intent.putExtra("instructions", recipeInstructions);
                startActivity(intent);
            }
        });
        Button BacSiu = findViewById(R.id.SinhToBo);
        BacSiu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String recipeInstructions = "Công thức làm Sinh tố bơ: Nguyên liệu:\n" +
                        "\n" +
                        "1 quả bơ chín mềm, lột vỏ và hạt\n" +
                        "1 chuỗi chuối chín (tùy chọn)\n" +
                        "1/2 chén sữa tươi (hoặc sữa đậu nành, sữa hạ đường)\n" +
                        "1/2 chén đá bào (tùy chọn)\n" +
                        "Đường hoặc mật ong để làm ngọt (nếu cần)\n" +
                        "Hướng dẫn:\n" +
                        "\n" +
                        "Chuẩn bị nguyên liệu: Lột vỏ và hạt của quả bơ, cắt thành từng miếng nhỏ. Nếu sử dụng chuối, bóc vỏ và cắt thành đoạn nhỏ.\n" +
                        "\n" +
                        "Đánh bát sinh tố: Đặt bơ (và chuối nếu có) và sữa vào bát sinh tố hoặc máy xay sinh tố.\n" +
                        "\n" +
                        "Xay sinh tố: Sử dụng máy xay sinh tố để xay nhuyễn hỗn hợp. Nếu bạn muốn có độ lạnh, thêm đá bào vào hỗn hợp và xay tiếp.\n" +
                        "\n" +
                        "Kiểm tra độ ngọt: Nếu bạn muốn thêm đường hoặc mật ong để làm ngọt hơn, hãy thêm dần và khuấy đều. Kiểm tra và điều chỉnh theo khẩu vị của bạn.\n" +
                        "\n" +
                        "Rót vào cốc và thưởng thức: Rót sinh tố vào cốc, thêm đá bào nếu muốn và thưởng thức ngay.";


                openRecipeDetailActivity(recipeInstructions);
            }
        });

        // Nút 4:
        Button TraDaoButton = findViewById(R.id.SinhToXoai);
        TraDaoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String recipeInstructions = "Công thức làm Sinh tố xoài:\n Nguyên liệu:\n" +
                        "\n" +
                        "1 quả xoài chín mềm, lột vỏ và cắt thành miếng nhỏ\n" +
                        "1 chuỗi chuối chín (tùy chọn)\n" +
                        "1/2 chén sữa tươi (hoặc sữa đậu nành, sữa hạ đường)\n" +
                        "1/2 chén đá bào (tùy chọn)\n" +
                        "Đường hoặc mật ong để làm ngọt (nếu cần)\n" +
                        "Hướng dẫn:\n" +
                        "\n" +
                        "Chuẩn bị nguyên liệu: Lột vỏ và cắt xoài thành những miếng nhỏ. Nếu sử dụng chuối, bóc vỏ và cắt thành đoạn nhỏ.\n" +
                        "\n" +
                        "Đánh bát sinh tố: Đặt xoài (và chuối nếu có) và sữa vào bát sinh tố hoặc máy xay sinh tố.\n" +
                        "\n" +
                        "Xay sinh tố: Sử dụng máy xay sinh tố để xay nhuyễn hỗn hợp. Nếu bạn muốn có độ lạnh, thêm đá bào vào hỗn hợp và xay tiếp.\n" +
                        "\n" +
                        "Kiểm tra độ ngọt: Nếu bạn muốn thêm đường hoặc mật ong để làm ngọt hơn, hãy thêm dần và khuấy đều. Kiểm tra và điều chỉnh theo khẩu vị của bạn.\n" +
                        "\n" +
                        "Rót vào cốc và thưởng thức: Rót sinh tố vào cốc, thêm đá bào nếu muốn và thưởng thức ngay.";
                openRecipeDetailActivity(recipeInstructions);
            }
        });
    }

    private void openRecipeDetailActivity(String recipeInstructions) {
        Intent intent = new Intent(Sinh_To_Activity.this, RecipeDetailActivity.class);
        intent.putExtra("instructions", recipeInstructions);
        startActivity(intent);
    }
}