public class OshoFreePromoEngine {
    public static double calculatePercentDiscount(int cartTotal , String promoCode){
        double price = 0;

                String promo = promoCode.toUpperCase();

            if (cartTotal > -1) {
        if(cartTotal < 5000){
                price = cartTotal;
        }

               else if (cartTotal >= 5000 && cartTotal <= 14999 && promo.equals("STARTER10")){
                       double discount = cartTotal * 0.1;
                            price = cartTotal - discount;

                }

               else if (cartTotal >= 15000 && cartTotal <= 29999 && promo.equals("BIGBOY20")){
                       double discount = cartTotal * 0.2;
                            price = cartTotal - discount;

                }

               else if (cartTotal >= 30000 && promo.equals("OSHOFREE35")){
                       double discount = cartTotal * 0.35;
                            price = cartTotal - discount;
                }

                        else{
                            price = cartTotal;
                        }

                }
                    


                return price;
    }

}

//switch (promo) {
//    case "STARTER10":
//        if (cartTotal >= 5000 && cartTotal <= 14999)
//            price = cartTotal - cartTotal * 0.1;
//        break;
//    case "BIGBOY20":
//        if (cartTotal >= 15000 && cartTotal <= 29999)
//            price = cartTotal - cartTotal * 0.2;
//        break;
//    case "OSHOFREE35":
//        if (cartTotal >= 30000)
//            price = cartTotal - cartTotal * 0.35;
//        break;
//    default:
//        price = cartTotal;
//}
//
//
//




