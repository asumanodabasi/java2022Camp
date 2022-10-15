using GameProject.Entitity;
using System;
using System.Collections.Generic;
using System.Text;

namespace GameProject
{
    interface IGameService
    {
        void Add(Gamer gamer);
        void Sell(Gamer gamer);
        void SellWithCampany(Gamer gamer, Game game, Campany campany);
    }
}
