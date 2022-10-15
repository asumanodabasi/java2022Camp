using GameProject.Entitity;
using System;
using System.Collections.Generic;
using System.Text;

namespace GameProject
{
    class GameManager : IGameService
    {
        ICampanyService _campanyService;

        public GameManager(ICampanyService campanyService)
        {
            _campanyService = campanyService;
        }

        public void Add(Gamer gamer)
        {
            Console.WriteLine("Oyun sisstme eklendi");
        }

        public void Sell(Gamer gamer)
        {
            Console.WriteLine("Oyun {0} isimli oyuncuya satıldı",gamer.FirstName);
        }

        public void SellWithCampany(Gamer gamer, Game game, Campany campany)
        {
            if (_campanyService.MakeDisCount(gamer,campany)==true)
            {
                Console.WriteLine("{0} isimli oyun {1} adlı kullanıcıya {2} kampanyasıyla satıldı.", game.GameName, gamer.FirstName, campany.CampanyName + campany.DisCountRate);
            }
            else
            {
                Console.WriteLine("Kampanya uygulanamadı");
            }
        }
    }
}
