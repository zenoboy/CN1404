package com.example.cn1404;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Do_Uong_Pha_CheActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_do_uong_pha_che);
        Button buttonsinhto = findViewById(R.id.back);

        buttonsinhto.setOnClickListener(new View.OnClickListener()
        {
            public void onClick (View view){
                Intent intent = new Intent(Do_Uong_Pha_CheActivity.this, douongactivity.class);

                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);

                startActivity(intent);
            }
        });
        Button cafeSuaButton = findViewById(R.id.CafeSua);
        cafeSuaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String recipeInstructions = "Công thức làm Cafe Sữa Nóng:\n" +
                        "Nguyên liệu:\n" +
                        "2-3 muỗng cà phê bột\n" +
                        "2-3 muỗng đường (tùy khẩu vị)\n" +
                        "2-3 muỗng nước nóng\n" +
                        "150ml sữa đặc hoặc sữa tươi\n" +
                        "Một chút cacao bột (tuỳ chọn)\n" +
                        "Cách thực hiện:\n" +
                        "Bước 1: Pha cà phê: Đặt bột cà phê vào cốc. Đổ nước nóng vào bột cà phê và khuấy đều cho bột cà phê tan hoàn toàn.\n" +
                        "\n" +
                        "Bước 2: Pha sữa: Trong một nồi nhỏ, hâm nóng sữa đặc hoặc sữa tươi trên lửa nhỏ. Đảm bảo sữa không sôi.\n" +
                        "\n" +
                        "Bước 3: Pha chung: Sau khi cà phê đã tan, đổ sữa đang hâm nóng vào cốc chứa cà phê.\n" +
                        "\n" +
                        "Thêm đường: Thêm đường theo khẩu vị cá nhân vào cốc cà phê sữa. Khuấy cho đến khi đường tan hoàn toàn.\n" +
                        "\n" +
                        "Bước 4: Trang trí (tuỳ chọn): Bạn có thể rắc một ít bột cacao lên trên cốc Café Sữa Nóng để làm điểm nhấn hoặc để tạo hình trang trí.\n" +
                        "\n" +
                        "Thưởng thức: Café Sữa Nóng sẵn sàng để thưởng thức";


                Intent intent = new Intent(Do_Uong_Pha_CheActivity.this, RecipeDetailActivity.class);
                intent.putExtra("instructions", recipeInstructions);
                startActivity(intent);
            }
        });
        Button CapuchinoButton = findViewById(R.id.Capuchino);
        CapuchinoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String recipeInstructions = "Công thức Capuchino: \n " +
                        "Nguyên liệu:\n" +
                        "\n" +
                        "1 shot espresso (khoảng 30-40ml)\n" +
                        "150ml sữa tươi\n" +
                        "1-2 muỗng đường (tuỳ khẩu vị)\n"+
                        "Bột ca cao (tùy chọn theo khẩu vị)\n"+
                        "Cách thực hiện:\n" +
                        "\n" +
                        "Bước 1: Pha espresso bằng máy pha cà phê espresso hoặc bằng máy pha cà phê moka.\n" +
                        "\n" +
                        "Bước 2: Trong một nồi nhỏ, đun sữa tươi trên lửa nhỏ cho đến khi sữa bắt đầu sủi bọt nhẹ.\n" +
                        "\n" +
                        "Bước 3: Nếu bạn muốn đường trong cappuccino, hòa đường vào sữa trong quá trình đun sữa. Khuấy đều để đường tan hoàn toàn.\n" +
                        "\n" +
                        "Bước 4: Tiếp theo, sữa tươi phải được đánh bông để tạo ra lớp bọt sữa mịn và đậm đà. Bạn có thể sử dụng máy đánh sữa hoặc đánh bằng tay. " +
                        "Đánh sữa cho đến khi nó có độ sệt và bọt sữa đạt được mong muốn.\n" +
                        "\n" +
                        "Bước 5: Đổ espresso vào cốc cappuccino.\n" +
                        "\n" +
                        "Lấy một muỗng hoặc ống hút, giữ phần đáy của bọt sữa và đổ sữa đánh bông lên trên espresso. " +
                        "Đổ từ từ và nhẹ nhàng để lớp bọt sữa dày đặc nằm trên mặt cà phê.\n" +
                        "Nếu bạn muốn, bạn có thể rắc một ít bột ca cao lên trên lớp bọt sữa để tạo thêm hương vị và trang trí.";
                Intent intent = new Intent(Do_Uong_Pha_CheActivity.this, RecipeDetailActivity.class);
                intent.putExtra("instructions", recipeInstructions);
                startActivity(intent);
            }
        });
        Button BacSiu = findViewById(R.id.BacSiu);
        BacSiu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String recipeInstructions = "Công thức làm Bạc Sỉu:\n " +
                        "Nguyên liệu:\n" +
                        "2-3 muỗng cà phê bột cà phê rang\n" +
                        "20ml nước cà phê đen\n" +
                        "20ml sữa đặc\n" +
                        "80ml sữa tươi không đường, không béo\n" +
                        "Cách thực hiện:\n" +
                        "\n" +
                        "Bước 1: Đặt bột cà phê rang vào cốc và đổ nước nóng vào. Khoảng 80ml nước nóng là đủ để pha một ly Bạc sỉu.\n" +
                        "\n" +
                        "Bước 2: Khuấy đều để bột cà phê tan hoàn toàn trong nước.\n" +
                        "Thêm nước đường vào cốc. Nếu bạn thích đường ngọt hơn, có thể điều chỉnh lượng đường theo khẩu vị. " +
                        "Bước 3: Tiếp theo, thêm sữa đặc vào cốc. Sữa đặc sẽ tạo ra lớp kem mịn và đậm đà trong Bạc sỉu. " +
                        "Bạn cũng có thể sử dụng sữa tươi thay cho sữa đặc nếu muốn.\n" +
                        "\n" +
                        "Bước 4: Khuấy đều các thành phần trong cốc cho đến khi hỗn hợp đồng nhất.\n" +
                        "\n" +
                        "Thêm đá viên vào cốc để làm mát đồ uống và tạo thêm hương vị.";


                openRecipeDetailActivity(recipeInstructions);
            }
        });

        // Nút 4:
        Button TraDaoButton = findViewById(R.id.TraDao);
        TraDaoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String recipeInstructions = "Công thức làm Trà đào cam sả: \n " +
                        "Nguyên liệu:" + "\n" +
                        "2 quả đào chín mọng\n" +
                        "2 quả cam tươi\n" +
                        "4-5 lá sả tươi\n" +
                        "4 túi trà túi lọc\n" +
                        "Đường hoặc mật ong (tùy khẩu vị)\n" +
                        "Đá viên\n" +
                        "Nước sôi\n" +
                        "Cách thực hiện:\n" +
                        "\n" +
                        "Bước 1: Gọt và lấy hạt đào, sau đó cắt đào thành từng lát mỏng. Làm tương tự với cam:\n" +
                        "\n" +
                        "Bước 2: Sả tươi rửa sạch và dập nhẹ để thực phẩm thả ra hương thơm.\n" +
                        "Bước 3: Trong một ấm đun nước, hâm nóng khoảng 4-5 tách nước (tùy thuộc vào số lượng ly trà bạn muốn).\n" +
                        "Bước 4: Khi nước sôi, thêm lá trà túi lọc vào ấm và để ngâm trong khoảng 3-5 phút để trà hòa quyện.\n" +
                        "\n" +
                        "Bước 5: Sau khi trà đã ngâm đủ thời gian, lấy túi trà ra khỏi ấm.\n" +
                        "\n" +
                        "Bước 6: Thêm đường hoặc mật ong vào nước trà, khuấy đều cho đường tan hoặc mật ong hoà quyện.\n" +
                        "Thêm vani:\n" +
                        "\n" +
                        "Bước 7: Đặt lát đào, cam vào ly trà và thêm lá sả đã dập vào ly trà\n" +
                        "Đông lạnh:\n" +
                        "\n" +
                        "Bước 8: Rót nước trà đã được ngọt vào ly, để nguội trong vài phút và thưởng thức";
                openRecipeDetailActivity(recipeInstructions);
            }
        });
    }

    private void openRecipeDetailActivity(String recipeInstructions) {
        Intent intent = new Intent(Do_Uong_Pha_CheActivity.this, RecipeDetailActivity.class);
        intent.putExtra("instructions", recipeInstructions);
        startActivity(intent);
    }
}
