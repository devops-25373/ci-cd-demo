# استخدم صورة OpenJDK 17 خفيفة الحجم
FROM openjdk:17-jdk-alpine

# حدد مجلد العمل داخل الحاوية
WORKDIR /app

# انسخ ملف الجار (Jar) المُنتج من المجلد target إلى الحاوية
COPY target/*.jar app.jar

# افتح البورت 8080 (المنفذ الافتراضي لـ Spring Boot)
EXPOSE 8080

# أمر تشغيل التطبيق عند بدء الحاوية
ENTRYPOINT ["java", "-jar", "app.jar"]