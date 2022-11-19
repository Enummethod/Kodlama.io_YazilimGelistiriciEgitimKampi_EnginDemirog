using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace YouTubeEgitim2
{
    internal class Program
    {
        static void Main(string[] args)
        {   //Ioc Container
            CustomerManager customerManager = new CustomerManager(new Customer(),new TeacherCreditManager());
            customerManager.GiveCredit();
            Console.ReadLine();

        }


        class CreditManager
        {
            //operasyonları tuttuk.
            public void Calculate()
            {
                Console.WriteLine("Hesaplandı");
            }

            public void Save()
            {
                Console.WriteLine("Kredi verildi.");
            }     
        }

        // Katmanlı mimaride temeli "özelliklerin operasyonlardan ayrılması"

        class CustomerManager
        {
            private Customer _customer;
            ICreditManager _creditManager;

            public CustomerManager(Customer customer, ICreditManager creditManager)
            {
                _customer = customer;
                _creditManager = creditManager;
            }
            public void Save()
            {
                Console.WriteLine(_customer.Id + "nolu müşterisi eklendi.");
            }
            public void Delete()
            {
                Console.WriteLine(_customer.Id + " müşterisi silindi.");
            }
            public void GiveCredit()
            {
               _creditManager.Calculate();
                Console.WriteLine("Kredi verilidi.");

            }
        }

        class Customer
        {
            public Customer()
            {
                Console.WriteLine("müşteri nesnesi başlatıldı.");
            }
            //Özellik tuttuk.
            public int Id { get; set; } //property
            public string City { get; set; }
        }

        class Company : Customer
        {
            public string TaxNumber { get; set; }
            public string CompanyName { get; set; }

        }
        class Person: Customer
        {
            public string NationalIdentity { get; set; }
            public string FirsName { get; set; }
            public string LastName { get; set; }
        }

        abstract class BaseCreditManager : ICreditManager
        {
            public abstract void Calculate();
          
            public virtual void Save()
            {
                Console.WriteLine("Kaydedildi");
            }
        }

        interface ICreditManager
        {
            void Calculate();
            void Save();
        }

        class TeacherCreditManager : BaseCreditManager, ICreditManager
        {
            public override void Calculate()
            {
                Console.WriteLine("Öğretmen Kredisi Hesaplandı.");
            }

            public override void Save()
            {
                //
                base.Save();
                //
            }

        }
        class MilitaryCreditManager : BaseCreditManager, ICreditManager
        {
            public override void Calculate()
            {
                Console.WriteLine("Asker Kredisi Hesaplandı");
            }
     
        }

    }
}
