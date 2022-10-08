using System;

namespace YoutubeEgitim
{
    class Program
    {
        static void Main(string[] args)
        {
            // DegerVeReferanceType();
            // ClassCheck();
            //IoC Container
            CustomerManager customerManager = new CustomerManager(new Customer(), new MilitaryCreditManager());
            customerManager.GiveCredit();

        }

        private static void ClassCheck()
        {
            CreditManager creditManager = new CreditManager();
            creditManager.Calculate();
            creditManager.Save();

            Customer customer = new Customer();
            customer.Id = 1;
            customer.City = "Ankara";

            Company company1 = new Company();

            //CustomerManager customerManager = new CustomerManager(new Person()); //örneğini oluştumak , instance oluşturmak, instance creation 
            //customerManager.Save();
            //customerManager.Delete();

            Company company = new Company();
            company.TaxNumber = "1222645";
            company.CopanyName = "Arçelik";
            company.Id = 100;

            Customer c1 = new Customer();
            Customer c2 = new Person();
            Customer c3 = new Company();

            Person person = new Person();
            person.NationalIdentity = "4445555";
        }

        private static void DegerVeReferanceType()
        {
            int sayi1 = 10;
            int sayi2 = 20;
            sayi1 = sayi2;
            sayi2 = 100;
            Console.WriteLine(sayi1);
            int[] sayilar1 = new[] { 1, 2, 3 };
            int[] sayilar2 = new[] { 10, 20, 30 };
            sayilar1 = sayilar2;
            sayilar2[0] = 1000;
            Console.WriteLine(sayilar1[0]);
        }

        class CreditManager
        { //soner qube
            public void Calculate()  //method
            {
                Console.WriteLine("Hesaplandı");
            }
            public void Save()  
            {
                Console.WriteLine("Kredi verildi");
            }
        }

        interface ICreditManager
        {
            void Calculate();
            void Save();
        }

        abstract class BaseCreditManager : ICreditManager
        {
            public abstract void Calculate();

            public virtual void Save()
            {
                Console.WriteLine("Kaydedildi");
            }
        }

        class TeacherKredtManager : BaseCreditManager,ICreditManager
        {
            public override void Calculate()
            {
                Console.WriteLine("Öğretmen kredisi hesaplandı");
            }

            public override void Save()
            {
                base.Save();
            }

        }

        class MilitaryCreditManager :BaseCreditManager ,ICreditManager
        {
            public  override void Calculate()
            {
                Console.WriteLine("Asker kredisi hesaplandı");
            }

            
        }

        class Customer
        {
            public Customer()
            {
                Console.WriteLine("Müşteri nesnesi başlatıldı");
            }
            
            public int Id { get; set; }
           
            public string City { get; set; }

        }

        class Person:Customer
        {
            public string FirstName { get; set; }
            public string LastName { get; set; }
            public string NationalIdentity { get; set; }
        }

        class Company : Customer
        {
            public string CopanyName { get; set; }
            public string TaxNumber { get; set; }

        }

        //katmanlı mimariler
        class CustomerManager
        {
            private Customer _customer;
            private ICreditManager _creditManager;
            public CustomerManager(Customer customer,ICreditManager creditManager)
            {
                _creditManager = creditManager;
                _customer = customer;
            }

            public void Save()
            {
                Console.WriteLine("Müşteri kaydedildi"+_customer.Id);
            }
            
            public void Delete()
            {
                Console.WriteLine("Müşteri silindi"+_customer.Id);
            }

            public void GiveCredit()
            {
                _creditManager.Calculate();
                Console.WriteLine("Kredi hesaplandı");
            }
        }
    }
}
