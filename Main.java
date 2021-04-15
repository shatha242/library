/**
 * Created by DELL on 4/13/2021.
 */
public class Main {

    public static void main(String[] args) {

        // أي كأننا قمنا بإنشاء 3 مؤلفين Author هنا قمنا بإنشاء 3 كائنات من الكلاس
        Author author1 = new Author("shatah", "+111111111111111", "shatah@gmail.com");
        Author author2 = new Author("Alaa",  "+333333333333",  "ALaa@gmail.com");
        Author author3 = new Author("rasha",   "+4444444444444",  "raha@gmail.com");

        // أي كأننا قمنا بإنشاء 4 كتب Book هنا قمنا بإنشاء 4 كائنات من الكلاس
        // Book وضعناه لكائنين من الكلاس author1 لاحظ أننا وضعنا الثلاث مؤلفين بداخل الكتب التي أنشأناها. و لاحظ أن الكائن
        // book2 و book1 يعتبر مؤلف الكتابين اللذين يمثلهما الكائنين author1 إذاً المؤلف الذي يمثله الكائن
        Book book1 = new Book("Learn Java", "12-20-2019", 1, author1);
        Book book2 = new Book("Learn HTML", "8-5-2018", 3, author1);
        Book book3 = new Book("PHP for beginners", "10-2-2019", 1, author2);
        Book book4 = new Book("C# for dummies", "12-20-2019", 1, author3);

        // لأننا نريد تخزين الكتب و المؤلفين بشكل مرتب بداخله Library هنا قمنا بإنشاء كائن من الكلاس
        Library library = new Library();

        // addAuthor() بواسطة الدالة library التي يمكلها الكائن authors هنا قمنا بإضافة المؤلفين في المصفوفة
        library.addAuthor(author1);
        library.addAuthor(author2);
        library.addAuthor(author3);

        // addBook() بواسطة الدالة library التي يمكلها الكائن books هنا قمنا بإضافة الكتب في المصفوفة
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        // printAuthor() الخاص بهم و بواسطة الدالة id هنا قمنا بطباعة معلومات كل المؤلفين بالإعتماد على رقم التعرفة
        // تذكر: رقم التعرفة الخاص بكل مؤلف تم إنشاؤه بشكل تلقائي عند إنشاء كل مؤلف بداخل الكونستركتور
        library.printAuthor(1);
        library.printAuthor(2);
        library.printAuthor(3);

        // printBook() الخاص بهم و بواسطة الدالة id هنا قمنا بطباعة معلومات كل الكتب بالإعتماد على رقم التعرفة
        // تذكر: رقم التعرفة الخاص بكل كتاب تم إنشاؤه بشكل تلقائي عند إنشاء كل كتاب بداخل الكونستركتور
        library.printBook(1);
        library.printBook(2);
        library.printBook(3);
        library.printBook(4);

        // printAuthorBooks() الخاص بهم و بواسطة الدالة id هنا قمنا بطباعة الكتب التي يملكها كل مؤلف بالإعتماد على رقم التعرفة
        library.printAuthorBooks(1);
        library.printAuthorBooks(2);
        library.printAuthorBooks(3);

        // removeAuthor() هنا قمنا بحذف المؤلف الذي يملك رقم التعرفة 2 بواسطة الدالة
        // printAuthorBooks() و printAuthor() بعدها حاولنا طباعة معلوماته و الكتب التي قام بتأليفها بواسطة الدالة
        // لاحظ أنه لم يحدث أي خطأ عند محاولة طباعة معلومات مؤلف لم يعد موجوداً لأن الدوال مصممة للتأكد قبل المحاولة الحذف
        library.removeAuthor(2);
        library.printAuthor(2);
        library.printAuthorBooks(2);

    }

}