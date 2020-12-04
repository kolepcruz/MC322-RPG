public class Assassino extends Rogue {
    public int assassinar(){
        if(this.getNivel()==2){
            int dano=0;
            for(int i=0;i<4;i++){
                dano+=Random1.fazRandom(6);
            }
            this.setContVigor(this.getContVigor()-10);
            return dano;//o aventureiro pode usar essa magia e rolará o segundo valor, multiplicará pelo primeiro e perderá o terceiro em pontos de mana.
        }else{
            return 0;//o aventureiro nao possui nivel para usar essa magia, ele deve escolher outra.
        }
    }

    public int golpeFatal(){
        if(this.getNivel()==3){
            int dano=0;
            for(int i=0;i<5;i++){
                dano+=Random1.fazRandom(10);
            }
            this.setContVigor(this.getContVigor()-20);
            return dano;//o aventureiro pode usar essa magia e rolará o segundo valor, multiplicará pelo primeiro e perderá o terceiro em pontos de mana.
        }else{
            return 0;//o aventureiro nao possui nivel para usar essa magia, ele deve escolher outra.
        }
    }
}
