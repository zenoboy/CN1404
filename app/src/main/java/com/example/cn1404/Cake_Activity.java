package com.example.cn1404;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Cake_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cake);
        Button cafeSuaButton = findViewById(R.id.Banhcupcake);
        cafeSuaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String recipeInstructions = "Công thức làm bánh cupcake:\n" +
                        "Nguyên liệu:\n" +
                        "1 1/2 cốc bột mì đa dụng\n" +
                        "1 1/2 muỗng cà phê bột nở\n" +
                        "1/4 muỗng cà phê muối\n" +
                        "1/2 cốc sữa tươi\n" +
                        "1/2 cốc bơ, hòa tan ở nhiệt độ phòng\n" +
                        "1 cốc đường\n" +
                        "2 quả trứng, hòa tan ở nhiệt độ phòng\n" +
                        "2 muỗng cà phê chiết xuất vani\n" +
                        "Cách thực hiện:\n" +
                        "Bước 1: Chuẩn bị lò nướng và khuôn cupcake: Trước tiên, hãy tiền nhiệt lò nướng ở nhiệt độ 175°C và chuẩn bị khuôn bánh cupcake bằng việc đặt giấy bạc vào các khe của khuôn.\n" +
                        "\n" +
                        "Bước 2: Pha trộn các thành phần khô: Trong một tô lớn, kết hợp bột mì, bột nở và muối. Trộn đều các thành phần này.\n" +
                        "\n" +
                        "Bước 3: Kết hợp thành phần ướt: Trong một tô khác, kết hợp sữa tươi và bơ tan chảy. Đảm bảo hỗn hợp không quá nóng.\n" +
                        "\n" +
                        "Bước 4: Kết hợp thành phần ướt và thành phần khô: Khi hỗn hợp bơ-sữa đã mát đi, thêm đường, trứng, và chiết xuất vani vào tô chứa hỗn hợp bột khô. Khuấy đều cho đến khi tất cả các thành phần chỉ kết hợp với nhau mà không quá đánh trộn.\n" +
                        "\n" +
                        "Bước 5: Rót bánh vào khuôn: Rót hỗn hợp bánh vào khuôn cupcake, điền khoảng 2/3 phần của mỗi khe. Đừng lấp đầy quá nhiều để bánh có không gian để phát triển lên khi nướng.\n" +
                        "\n" +
                        "Bước 6: Nướng: Đặt khuôn bánh vào lò đã tiền nhiệt và nướng trong khoảng 18-20 phút hoặc cho đến khi bánh nâu và lòn lên. Kiểm tra bằng cách chọc một que tre vào bánh, nếu que tre ra sạch, bánh đã nướng chín.\n" +
                        "\n" +
                        "Bước 7: Làm mát và trang trí: Khi bánh cupcake đã nướng chín, để bánh nguội trên giá để làm mát. Sau đó, bạn có thể trang trí bánh với kem tươi, frosting, hoặc lớp đường mịn tùy theo sở thích và thưởng thức";

                Intent intent = new Intent(Cake_Activity.this, RecipeDetailActivity.class);
                intent.putExtra("instructions", recipeInstructions);
                startActivity(intent);
            }
        });
        Button CapuchinoButton = findViewById(R.id.SuKem);
        CapuchinoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String recipeInstructions = "Công thức Bánh Su kem:\n" +
                        "Nguyên liệu:\n" +
                        "\n" +
                        "Cho bánh su:\n" +
                        "\n" +
                        "125g bột mì\n" +
                        "125ml nước\n" +
                        "50g bơ\n" +
                        "4 quả trứng\n" +
                        "1/4 muỗng cà phê muối\n" +
                        "1 muỗng cà phê đường\n" +
                        "Cho kem:\n" +
                        "\n" +
                        "500ml kem tươi (trên 35% chất béo)\n" +
                        "50g đường\n" +
                        "1 muỗng cà phê chiết xuất vani (tùy chọn)\n" +
                        "Cách thực hiện:\n" +
                        "\n" +
                        "Bước 1: Chuẩn bị bánh su:\n" +
                        "\n" +
                        "Trước tiên, hãy chuẩn bị nồi nhỏ với nước sôi và hâm nóng lò nướng ở nhiệt độ 200°C.\n" +
                        "Trộn bột mì, muối và đường trong một tô nhỏ.\n" +
                        "Trong một nồi nhỏ, đun nước và bơ cho đến khi bơ tan hoàn toàn.\n" +
                        "Đổ hỗn hợp bột mì vào nồi với nước và bơ. Khuấy đều cho tới khi hỗn hợp trở thành một bột nhão.\n" +
                        "Tiếp theo, thêm từng quả trứng một vào bột và khuấy đều sau mỗi lần thêm trứng. Khi bột trở nên mịn và đồng nhất, dừng khuấy.\n" +
                        "Đặt bột vào một túi đã cắt đầu và ống bằng kích thước mong muốn.\n" +
                        "Trên một khay nướng, hãy vẽ những vòng tròn nhỏ với bột su, để khoảng cách giữa các vòng tròn là đều nhau.\n" +
                        "Đặt khay vào lò nướng và nướng bánh su trong khoảng 20-25 phút cho đến khi chúng có màu vàng nhạt và phồng lên. Sau khi nướng xong, tắt lò nướng và để bánh su trong lò để nguội.\n" +
                        "Bước 2: Chuẩn bị kem:\n" +
                        "\n" +
                        "Trong một tô lớn, đánh kem tươi và đường với tốc độ cao cho đến khi kem đứng đầu khi bạn nhấc đầu hòa vòi.\n" +
                        "Nếu muốn, thêm chiết xuất vani vào kem và khuấy đều.\n" +
                        "Đổ kem vào một ống tiêm kem hoặc một túi đã cắt đầu và ống bằng kích thước mong muốn.\n" +
                        "Bước 3: Lắp ráp bánh su kem:\n" +
                        "\n" +
                        "Khi bánh su đã nguội hoàn toàn, cắt một đường ngang ở phần trên của mỗi bánh su, tạo ra một miệng cho bánh.\n" +
                        "Đặt ống tiêm kem hoặc túi kem vào miệng của mỗi bánh su và nhẹ nhàng nhấn để kem điền vào bên trong. Bạn cũng có thể sử dụng một muỗng để đổ kem vào bánh su.\n" +
                        "Chúng ta có thể thêm thêm một lớp kem trên cùng của bánh su và chồng các bánh lên nhau để tạo thành một chiếc bánh su kem lớn.\n" +
                        "Cuối cùng, bạn có thể trang trí bánh su kem với đường tinh bột, đường tinh khiết hoặc bột cacao tùy thích.";
                Intent intent = new Intent(Cake_Activity.this, RecipeDetailActivity.class);
                intent.putExtra("instructions", recipeInstructions);
                startActivity(intent);
            }
        });
        Button BacSiu = findViewById(R.id.Banhbonglan);
        BacSiu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String recipeInstructions = "Công thức làm bánh bông lan:\n" +
                        "Nguyên liệu:\n" +
                        "2 cốc bột mỳ đa dụng\n" +
                        "1 1/2 muỗng cà phê bột nở\n" +
                        "1/2 muỗng cà phê muối\n" +
                        "1/2 cốc sữa tươi, ấm\n" +
                        "1/2 cốc bơ, hòa tan ở nhiệt độ phòng\n" +
                        "1 cốc đường\n" +
                        "2 quả trứng, ấm\n" +
                        "2 muỗng cà phê chiết xuất vani\n" +
                        "Cách thực hiện:\n" +
                        "Bước 1: Chuẩn bị lò nướng và khuôn bánh bông lan:\n" +
                        "\n" +
                        "Tiền nhiệt lò nướng ở 175°C.\n" +
                        "Chuẩn bị khuôn bánh bông lan bằng cách chèn giấy bạc vào các khe của khuôn hoặc sử dụng khuôn silicone.\n" +
                        "Bước 2: Pha trộn nguyên liệu khô:\n" +
                        "\n" +
                        "Trong một tô nhỏ, pha trộn bột mỳ, bột nở và muối. Đảm bảo trộn đều các thành phần này.\n" +
                        "Bước 3: Pha trộn nguyên liệu ướt:\n" +
                        "\n" +
                        "Trong một tô lớn, đánh bơ và đường cho đến khi hỗn hợp trở nên mịn và không bị đồng nhất.\n" +
                        "Thêm trứng một cái một cái, đánh đều sau mỗi lần thêm.\n" +
                        "Tiếp theo, thêm chiết xuất vani và sữa ấm. Khuấy đều cho đến khi tất cả các thành phần kết hợp.\n" +
                        "Bước 4: Kết hợp bột và hỗn hợp ướt:\n" +
                        "\n" +
                        "Khi hỗn hợp ướt đã hoàn chỉnh, thêm từ từ bột đã pha trộn từ bước 2 vào hỗn hợp ướt. Khuấy đều nhưng không quá lâu để tránh làm cứng bánh.\n" +
                        "Bước 5: Nướng bánh bông lan:\n" +
                        "\n" +
                        "Rót hỗn hợp bánh vào khuôn đã chuẩn bị trước đó.\n" +
                        "Đặt khuôn bánh vào lò nướng và nướng khoảng 20-25 phút hoặc cho đến khi bánh nâu và que thử bánh chọc vào giữa ra sạch.\n" +
                        "Bước 6: Làm mát và thưởng thức:\n" +
                        "\n" +
                        "Khi bánh bông lan đã nướng chín, để bánh nguội trên giá để làm mát.\n" +
                        "Bánh bông lan đã làm sẵn để thưởng thức! Bạn có thể trang trí bánh hoặc thêm lớp đường mịn trên trên nếu muốn.";


                openRecipeDetailActivity(recipeInstructions);
            }
        });

        // Nút 4:
        Button TraDaoButton = findViewById(R.id.BanhDonut);
        TraDaoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String recipeInstructions = "Công thức làm Bánh Donut:\n" +
                        "Nguyên liệu:\n" +
                        "Cho bánh donut:\n" +
                        "\n" +
                        "2 1/4 cốc bột mỳ đa dụng\n" +
                        "1/2 cốc đường\n" +
                        "2 muỗng canh bơ, tan chảy\n" +
                        "2 quả trứng\n" +
                        "3/4 cốc sữa\n" +
                        "2 muỗng cà phê bột nở\n" +
                        "1/4 muỗng cà phê muối\n" +
                        "1/2 muỗng cà phê chiết xuất vani\n" +
                        "Cho việc chiên:\n" +
                        "\n" +
                        "Dầu ăn (đủ để chiên)\n" +
                        "Cho lớp phủ (tuỳ chọn):\n" +
                        "\n" +
                        "Đường trắng\n" +
                        "Sô cô la nướng\n" +
                        "Cách thực hiện:\n" +
                        "Bước 1: Chuẩn bị hỗn hợp bánh donut:\n" +
                        "\n" +
                        "Trước hết, tiền nhiệt lò nướng lên 180°C và chuẩn bị khay nướng bằng cách lót giấy nướng hoặc sử dụng khuôn đúc bánh donut.\n" +
                        "\n" +
                        "Trong một tô lớn, kết hợp bột mỳ, bột nở và muối. Trộn đều các nguyên liệu khô này.\n" +
                        "\n" +
                        "Trong một tô khác, đánh đều bơ và đường cho đến khi hỗn hợp trở nên mịn và không bị đồng nhất.\n" +
                        "\n" +
                        "Thêm trứng vào hỗn hợp bơ đường và đánh đều.\n" +
                        "\n" +
                        "Tiếp theo, thêm sữa và chiết xuất vani vào hỗn hợp bơ trứng. Khuấy đều.\n" +
                        "\n" +
                        "Kết hợp hỗn hợp ướt và hỗn hợp khô, khuấy cho đến khi tất cả các thành phần kết hợp lại thành hỗn hợp bánh mịn.\n" +
                        "\n" +
                        "Bước 2: Làm bánh donut:\n" +
                        "\n" +
                        "Đổ hỗn hợp bánh vào túi hoặc bình xịt bánh (nếu có) để dễ dàng rót vào khuôn hoặc khay nướng.\n" +
                        "\n" +
                        "Rót hỗn hợp bánh vào khuôn donut, điền khoảng 2/3 phần của mỗi khe để bánh có không gian để nở lên khi nướng.\n" +
                        "\n" +
                        "Đặt khay nướng vào lò và nướng trong khoảng 10-12 phút hoặc cho đến khi bánh nâu và nở lên.\n" +
                        "\n" +
                        "Bước 3: Chiên bánh donut:\n" +
                        "\n" +
                        "Trước tiên, hãy đảm bảo dầu ở nhiệt độ 180°C.\n" +
                        "\n" +
                        "Khi bánh donut đã nướng xong và đã nguội, hãy nhúng bánh vào dầu nóng. Chiên từ 1-2 phút mỗi mặt hoặc cho đến khi bánh vàng đều.\n" +
                        "\n" +
                        "Bước 4: Trang trí (tuỳ chọn):\n" +
                        "\n" +
                        "Sau khi bánh đã nguội, bạn có thể trang trí bằng đường trắng, sô cô la nướng, hoặc các loại gia vị khác tuỳ theo sở thích cá nhân và thưởng thức";

                openRecipeDetailActivity(recipeInstructions);
            }
        });
    }

    private void openRecipeDetailActivity(String recipeInstructions) {
        Intent intent = new Intent(Cake_Activity.this, RecipeDetailActivity.class);
        intent.putExtra("instructions", recipeInstructions);
        startActivity(intent);
    }
}