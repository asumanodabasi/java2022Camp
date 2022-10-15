using System;
using System.Collections.Generic;
using System.Text;

namespace GameProject
{
    class GamerManager : IGamerService
    {
        IUserValidationService _userValidationService;

        public GamerManager(IUserValidationService userValidationService)
        {
            _userValidationService = userValidationService;
        }

        public bool Add(Gamer gamer)
        {
         if(_userValidationService.Validate(gamer)==true)
            { 
                Console.WriteLine("Kayıt oldu");
                return true;
            }
            else
            {
                Console.WriteLine("Kayıt başarsız");
                return false;
            }
        }

        public void Delete(Gamer gamer)
        {
            Console.WriteLine("Kayıt silindi");
        }

        public void Update(Gamer gamer)
        {
            Console.WriteLine("Kayıt güncellendi");
        }
    }
}
