require('dotenv').config({path:__dirname+'/.env'})

class VariaveisConfig{
    public getVarivel = process.env;        
}

export const config = new VariaveisConfig();