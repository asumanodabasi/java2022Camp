using GameProject.Entitity;
using System;
using System.Collections.Generic;
using System.Text;

namespace GameProject
{
    class CampanyManager : ICampanyService
    {
        public void Add(Campany campany)
        {
              Console.WriteLine("Yeni kampanya eklendi!!"); 
        }

        public void Delete(Campany campany)
        {
            Console.WriteLine("Yeni kampanya silindi!!");
        }

        public bool MakeDisCount(Gamer gamer, Campany campany)
        {
            if(gamer.IdentityNumber==12345)
            {
                Console.WriteLine("{0} isimli oyuncuya {1} kampanyamız uygulandı", gamer.FirstName, campany.CampanyName);
                return true;
            }
            else
            {
                Console.WriteLine("{0} isimli oyuncuya {1} kampanyamız uygulanamadı",gamer.FirstName, campany.CampanyName);
                return false;
            }
        }

        public void Update(Campany campany)
        {
            Console.WriteLine("Yeni kampanya güncellendi!");
        }
    }
}
