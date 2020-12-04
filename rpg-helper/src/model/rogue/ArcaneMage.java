public class ArcaneMage extends Mage {
    public int armaduraArcana(){
        if(this.getNivel()==1){
            int dano=0;
            for(int i=0;i<4;i++){
                dano+=Random1.fazRandom(4);
            }
            this.setContMana(this.getContMana()-8);
            return dano;//o aventureiro pode usar essa magia e rolará o segundo valor, multiplicará pelo primeiro e perderá o terceiro em pontos de mana.
        }else{
            return 0;//o aventureiro nao possui nivel para usar essa magia, ele deve escolher outra.
        }
    }

    public int misseisMagicos(){
        if(this.getNivel()==2){
            int dano=0;
            for(int i=0;i<6;i++){
                dano+=Random1.fazRandom(6);
            }
            this.setContMana(this.getContMana()-18);
            return dano;//o aventureiro pode usar essa magia e rolará o segundo valor, multiplicará pelo primeiro e perderá o terceiro em pontos de mana.
        }else{
            return 0;//o aventureiro nao possui nivel para usar essa magia, ele deve escolher outra.
        }
    }

    public int rajadaPrismatica(){
        if(this.getNivel()==3){
            int dano=0;
            for(int i=0;i<10;i++){
                dano+=Random1.fazRandom(10);
            }
            this.setContMana(this.getContMana()-28);
            return dano;//o aventureiro pode usar essa magia e rolará o segundo valor, multiplicará pelo primeiro e perderá o terceiro em pontos de mana.
        }else{
            return 0;//o aventureiro nao possui nivel para usar essa magia, ele deve escolher outra.
        }
    }

    public int portlArcano(){
        if(this.getNivel()==4){
        int dano=0;
        for(int i=0;i<10;i++){
        dano+=Random1.fazRandom(6);
        }
        this.setContMana(this.getContMana()-22);
        return dano;//o aventureiro pode usar essa magia e rolará o segundo valor, multiplicará pelo primeiro e perderá o terceiro em pontos de mana.
        }else{
        return 0;//o aventureiro nao possui nivel para usar essa magia, ele deve escolher outra.
        }
    }
}
