package it.unisalento.pps.Business;

import it.unisalento.pps.Model.Centro;

public class CentroBusiness {

        public Centro informazioni() {

            Centro c = new Centro();
            c = c.prendiinfo();
            return c;
        }

}
