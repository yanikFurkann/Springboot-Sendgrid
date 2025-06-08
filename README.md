#  Spring Boot & SendGrid ile E-Posta Gönderimi
Bu proje, Spring Boot ve SendGrid API kullanarak e-posta gönderimi yapabilen basit ve modüler bir uygulamadır. Özellikle mikroservis mimarisinde e-posta bildirimleri gibi işlevleri dış servis olarak ayırmak isteyenler için temel bir örnek sunar.

 * Kullanılan Teknolojiler:
  
*Java 21

* Spring Boot

* SendGrid Java SDK

* Lombok

* Maven

 🔐 Güvenlik Notu
* API anahtarınızı hiçbir zaman GitHub'a yüklemeyin.

 * application.properties dosyasını .gitignore içine alın veya ortam değişkeni kullanın.

 ✅  API Kullanımı 
* E-Posta Gönderme

* POST /api/send-email

{
  "to":  "ornek@mail.com",
  
  "subject":  "Merhaba!",
  
  "body":  "Bu bir test mailidir."
  
}

![Ekran görüntüsü 2025-06-06 033828](https://github.com/user-attachments/assets/cbfd42cc-9fa8-4bd4-8d60-153f1f2620cf)

![image](https://github.com/user-attachments/assets/f53e2cf2-f094-4e89-b3c1-3908b0a46088)


This project is a simple and modular application that sends emails using Spring Boot and the SendGrid API. It serves as a basic example for those who want to separate functionalities like email notifications into external services, especially in a microservices architecture.

*  Built With

* Java 21

* Spring Boot

* SendGrid Java SDK

* Lombok

* Maven
## 🔐 Security Note

- Never commit your SendGrid API key to version control.
- Make sure to add your `application.properties` or `.env` files to `.gitignore`.
- It's recommended to store your API keys using environment variables.

## 👨‍💻 Developer

  * * Furkan Yanık   
* furkan.02323@icloud.com
* Thank You. (Teşekkürler)





