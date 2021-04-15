/**
 * Created by DELL on 4/9/2021.
 */
public class Book {

    //  بتعريف الخصائص الأساسية  حق  الكتاب
    int id;
    String title;
    String publishingDate;
    int version;
    Author author;

    // لأننا بنفس الوقت نريده أن يكون موحداً private و static قمنا بتعريفه كـ idIncrementer المتغير
    // لجميع الكائنات التي ننشئها من هذا الكلاس و لا يمكن التعامل معه بشكل مباشر من أي كلاس آخر
    private static int idIncrementer = 0;
    // هنا قمنا بتعريف كونستركتور للكلاس حتى نستطيع إسناد قيم للكائن الذي ننشئه من هذا الكلاس بشكل مباشر
    // id تزيد 1 في كل مرة و من ثم يتم وضعها في الخاصية idIncrementer لاحظ أننا قمنا بتحديد أن قيمة
    // الخاصة بالكائن. القيم الأخرى التي سيتم تمريرها للكائن سيتم تخزينها بشكل مباشر في خصائص الكائن
    public Book(String title, String publishingDate, int version, Author author)
    {
        idIncrementer++;
        this.id = idIncrementer;
        this.title = title;
        this.publishingDate = publishingDate;
        this.version = version;
        this.author = author;
    }

}