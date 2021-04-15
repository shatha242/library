import java.util.ArrayList;

/**
 * Created by DELL on 4/11/2021.
 */
// يمثل كل ما تحتويه المكتبة من كتب و مؤلفين و الدوال التي يمكن استخدامها للتعامل معهم Library الكلاس
public class Library {

    // سنضع فيه كل معلومات الكتب books سنضع فيه كل معلومات المؤلفين, و الكائن authors الكائن
    ArrayList<Author> authors = new ArrayList();
    ArrayList<Book> books = new ArrayList();

    // authors بداخل المصفوفة Author يمكن استخدامها لإضافة كائن من الكلاس addAuthor() الدالة
    public void addAuthor(Author author)
    {
        authors.add(author);
    }

    // الخاص به id بالإعتماد على رقم الـ authors موضوع بداخل المصفوفة Author يمكن استخدامها لإلغاء كائن من الكلاس removeAuthor() الدالة
    public void removeAuthor(int id)
    {
        // author و كل كائن نمر عليه سنضعه بشكل مؤقته بداخل الكائن authors بواسطة هذه الحلقة سنمر على جميع الكائنات المخزنة بداخل المصفوفة
        for (Author author: authors)
        {
            // الذي مررناه للدالة سيتم حذفه و من ثم الخروج من الدالة id يملك نفس رقم الـ author في حال كان الكائن
            if (author.id == id)
            {
                authors.remove(author);
                return;
            }
        }

        // الذي تم تمريره للدالة سيتم طباعة الجملة التالية id يملك نفس رقم الـ authors في حال لم يتم إيجاد أي كائن في المصفوفة
        System.out.println("Author with id " + id + " is not found!");
        System.out.println("----------------------");
    }

    // الخاص به id بالإعتماد على رقم الـ authors يمكن استخدامها لطباعة كل المعلومات المتوفرة حول مؤلف موضوع بداخل المصفوفة printAuthor() الدالة
    public void printAuthor(int id)
    {
        // author و كل كائن نمر عليه سنضعه بشكل مؤقته بداخل الكائن authors بواسطة هذه الحلقة سنمر على جميع الكائنات المخزنة بداخل المصفوفة
        for (Author author: authors)
        {
            // الذي مررناه للدالة سيتم طباعة كل معلوماته و من ثم الخروج من الدالة id يملك نفس رقم الـ author في حال كان الكائن
            if (author.id == id)
            {
                System.out.println("Author with id " + id + " info.");
                System.out.println("Name: " + author.name );
                System.out.println("Phone: " + author.phone);
                System.out.println("Email: " + author.email);
                System.out.println("----------------------");
                return;
            }
        }

        // الذي تم تمريره للدالة سيتم طباعة الجملة التالية id يملك نفس رقم الـ authors في حال لم يتم إيجاد أي كائن في المصفوفة
        System.out.println("Author with id " + id + " is not found!");
        System.out.println("----------------------");
    }

    // الخاص به id بالإعتماد على رقم الـ authors يمكن استخدامها لطباعة كل أسماء الكتب التي قام بتأليفها مؤلف موضوع بداخل المصفوفة printAuthorBooks() الدالة
    public void printAuthorBooks(int id)
    {
        // الذي تم تمريره للدالة id يملك رقم الـ authors بهدف التأكد ما إن كان يوجد كاتب في المصفوفة isAuthorExist سنستخدم المتغير
        // من إعداد هذا الكاتب لأن ذلك سيكون غير منطقي books لأنه إن لم يكن هناك كاتب أصلاً فلن نقوم بالبحث عن كتب في المصفوفة
        boolean isAuthorExist = false;
        String authorName = "";

        // author و كل كائن نمر عليه سنضعه بشكل مؤقته بداخل الكائن authors هنا سنمر على جميع الكائنات المخزنة بداخل المصفوفة
        for (Author author: authors)
        {
            // authorName الذي مررناه للدالة سيتم تخزين إسم المؤلف في المتغير id يملك نفس رقم الـ author في حال كان الكائن
            // authors و إيقاف الحلقة لأننا تأكدنا أن هذا المؤلف موجود في المصفوفة true إلى isAuthorExist و من ثم تغيير قيمة
            if (author.id == id)
            {
                isAuthorExist = true;
                authorName = author.name;
                break;
            }
        }

        // authors فهذا يعني أنه لم يتم إيجاد أي كائن في المصفوفة false تساوي isAuthorExist في حال بقيت قيمة
        // الذي تم تمريره للدالة سيتم طباعة الجملة التالية و الخروج من الدالة id يملك نفس رقم الـ
        if (!isAuthorExist)
        {
            System.out.println("Author with id " + id + " is not found!");
            System.out.println("----------------------");
            return;
        }

        // هنا سيتم طباعة إسم المؤلف
        System.out.println("Books of author " + authorName + ":");

        // book و كل كائن نمر عليه ( و الذي يمثل كتاب ) سنضعه بشكل مؤقته بداخل الكائن books هنا سنمر على جميع الكائنات المخزنة بداخل المصفوفة
        for (Book book: books)
        {
            // الذي تم تمريره id يملك نفس رقم الـ book ( أي المؤلف ) الموضوع في الكائن author في حال كان الكائن
            // و بالتالي سيتم طباعة إسم هذا الكتاب book للدالة فهذا يعني أنه هو مؤلف الكتاب الحالي المخزن في الكائن
            if (book.author.id == id)
            {
                System.out.println("- " + book.title);
            }
        }
        System.out.println("----------------------");
    }

    // books بداخل المصفوفة Book يمكن استخدامها لإضافة كائن من الكلاس addBook() الدالة
    public void addBook(Book book)
    {
        books.add(book);
    }
    // الخاص به id بالإعتماد على رقم الـ books موضوع بداخل المصفوفة Book يمكن استخدامها لإلغاء كائن من الكلاس removeBook() الدالة
    public void removeBook(int id)
    {
        // book و كل كائن نمر عليه سنضعه بشكل مؤقته بداخل الكائن books بواسطة هذه الحلقة سنمر على جميع الكائنات المخزنة بداخل المصفوفة
        for (Book book: books)
        {
            // الذي مررناه للدالة سيتم حذفه و من ثم الخروج من الدالة id يملك نفس رقم الـ book في حال كان الكائن
            if (book.id == id)
            {
                books.remove(book);
                return;
            }
        }

        // الذي تم تمريره للدالة سيتم طباعة الجملة التالية id يملك نفس رقم الـ books في حال لم يتم إيجاد أي كائن في المصفوفة
        System.out.println("Book with id " + id + " is not found!");
        System.out.println("----------------------");
    }

    // الخاص به id بالإعتماد على رقم الـ books يمكن استخدامها لطباعة كل المعلومات المتوفرة حول كتاب موضوع بداخل المصفوفة printBook() الدالة
    public void printBook(int id)
    {
        // book و كل كائن نمر عليه سنضعه بشكل مؤقته بداخل الكائن books بواسطة هذه الحلقة سنمر على جميع الكائنات المخزنة بداخل المصفوفة
        for (Book book: books)
        {
            // الذي مررناه للدالة سيتم طباعة كل معلوماته و من ثم الخروج من الدالة id يملك نفس رقم الـ book في حال كان الكائن
            if (book.id == id)
            {
                System.out.println("Book with id " + id + " info.");
                System.out.println("Title: " + book.title);
                System.out.println("Version: " + book.version);
                System.out.println("Publishing date: " + book.publishingDate);
                System.out.println("Author: " + book.author.name);
                System.out.println("----------------------");
                return;
            }
        }

        // الذي تم تمريره للدالة سيتم طباعة الجملة التالية id يملك نفس رقم الـ books في حال لم يتم إيجاد أي كائن في المصفوفة
        System.out.println("Book with id " + id + " is not found!");
        System.out.println("----------------------");
    }

}