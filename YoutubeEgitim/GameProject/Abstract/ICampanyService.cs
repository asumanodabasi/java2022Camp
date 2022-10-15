using GameProject.Entitity;
using System;
using System.Collections.Generic;
using System.Text;

namespace GameProject
{
    interface ICampanyService
    {
        void Add(Campany campany);
        void Delete(Campany campany);
        void Update(Campany campany);
        bool MakeDisCount(Gamer gamer, Campany campany);

    }
}
