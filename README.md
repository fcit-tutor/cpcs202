[English](file:///home/algo/tutoring-material/cpcs202/README-en.md)

# خصوصي الحاسبات – برمجة 1 


سنين من محتوى برمجة 1 من اختبارات سابقة وواجبات والكثير.. كله في هذا المستودع منقح ومعدل وقيد التطوير!


طلاب [خصوصي الحاسبات](https://t.me/fcit_tutor) حيستفيدوا الكثير وهذي البداية بس.

## التحميل

حمل [Git](https://git-scm.com/) أولًا، وبعدها تابع الخطوات حسب نظام تشغيلك:


تنسخ الأوامر التالية مستودع `cpcs202` على سطح المكتب.

### Windows (PowerShell)

افتح PowerShell ونفّذ الأوامر التالية:

```
cd ~/Desktop
git clone https://github.com/fcit-tutor/cpcs202.git
```

### macOS (Terminal)

افتح لوحة الأوامر (Terminal) ونفّذ الأوامر التالية:

```
mkdir -p "$HOME/Desktop"  
cd "$HOME/Desktop"  
git clone https://github.com/fcit-tutor/cpcs202.git
```

### GNU/Linux (Terminal)

افتح لوحة الأوامر (Terminal) ونفّذ الأوامر التالية:

(الأوامر راح تشوف إذا عندك مجلد سطح مكتب تلقائي وتضع فيه مجلد المادة إذا لا راح تعمل لك سطح مكتب)

```
desktop\_dir="$(xdg-user-dir DESKTOP 2\>/dev/null)"  
desktop\_dir="$\{desktop\_dir:-$HOME/Desktop\}"  
mkdir -p "$desktop\_dir"  
cd "$desktop\_dir"  
git clone https://github.com/fcit-tutor/cpcs202.git
```

## التحديثات

سأعلن عن جميع التحديثات الرئيسية في [قناة خصوصي الحاسبات fcit\_tutor على تيليجرام](https://t.me/fcit_tutor).


لتحديث محتوى المستودع في حال وجود تحديثات اتبع الأوامر التالية حسب نظام تشغيلك:

**ملاحظة: إذا فتحت لوحة الأوامر داخل مستودع  cpcs-202 تقدر تكتب الأمر التالي فقط للحصول على التحديثات (مو لازم ترجع تنسخ المستودع أو تتبع الأوامر اللي فوق):**

```
 git pull --ff-only
```

### Windows (PowerShell)

```
cd ~/Desktop/cpcs202
git pull --ff-only
```

### macOS (Terminal)

```
cd "$HOME/Desktop/cpcs202" && git pull --ff-only
```

### GNU/Linux (Terminal)

```
desktop\_dir="$(xdg-user-dir DESKTOP 2\>/dev/null)"  
desktop\_dir="$\{desktop\_dir:-$HOME/Desktop\}"  
cd "$desktop\_dir/cpcs202" && git pull --ff-only
```
