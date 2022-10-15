using System;
using System.Collections.Generic;
using System.Text;

namespace GameProject
{
    class UserValidationManager : IUserValidationService
    {
        public bool Validate(Gamer gamer)
        {
            if (gamer.BirthYear == 2003 && gamer.FirstName == "ASUMAN" && gamer.LastName =="ODABASİ" && gamer.IdentityNumber == 12345)
            {
                return true;
            }

            else
            {
                return false;
            }
        }
    }
}
