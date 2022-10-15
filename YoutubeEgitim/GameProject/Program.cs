using GameProject.Entitity;
using System;

namespace GameProject
{
    class Program
    {
        static void Main(string[] args)
        {
            GamerManager gamerManager = new GamerManager(new UserValidationManager());
            gamerManager.Add(new Gamer
            {
                Id = 1,
                BirthYear = 2003,
                FirstName = "ASUMAN",
                LastName = "ODABASİ",
                IdentityNumber = 12345
            });
            

            Gamer gamer = new Gamer();
            gamer.FirstName = "Asuman";

            Game game1 = new Game();
            game1.GameName = "Fight";
            game1.GamePrice = 200;
            game1.GameId = 2;
            

            Campany campany = new Campany();
            campany.CampanyId = 1;
            campany.CampanyName = "Kışa özel fırsat";
            campany.DisCountRate = 0.2f;

            GameManager game = new GameManager(new CampanyManager());
            //game.Sell(gamer);
            game.Add(gamer);
            game.SellWithCampany(new Gamer
            { FirstName = "Asu", LastName = "Odabasi", IdentityNumber = 12345 },
            new Game
            { GameId = 1, GameName = "Fight", GamePrice = 200 },
            new Campany
            { CampanyId = 1, CampanyName = "Kışa özel fırsat", DisCountRate = 0.2f });

            CampanyManager campanyManager = new CampanyManager();
            campanyManager.Add(campany);
            //campanyManager.MakeDisCount(new Gamer {FirstName="Asu",LastName="Odabasi",IdentityNumber=12345 },new Campany {CampanyName="Kışa özel fırsat" });

            
        }
    }
}
