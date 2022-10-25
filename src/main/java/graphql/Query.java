package graphql;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLRootResolver;

import entity.Logement;
import entity.RendezVous;
import repository.LogementRepository;
import repository.RendezVousRepository;

public class Query implements GraphQLRootResolver {
    private RendezVousRepository  rendezVousRepository;
    private LogementRepository logementRepository;
public Query(RendezVousRepository r, LogementRepository l) {
    this.logementRepository =l;
    this.rendezVousRepository=r;
}


    public List<RendezVous> allRendezVousList(){
    return this.rendezVousRepository.getListeRendezVous();
    }
    public List<RendezVous> allRendezVousByLogementRef(int reference){return this.rendezVousRepository.getListeRendezVousByLogementRef(reference);}
//    public List<RendezVous> allRendezVousById(int id){return this.rendezVousRepository.getLogementByRDV(id);}

//    public List<Logement> allLogementList(){return this.logementRepository.getAllLogements();}
//    public List<Logement> allLogementByType(String type){return this.logementRepository.getLogementsByType(Logement.Type.valueOf(type));}
//    public Logement getLogementByRef(int reference){return this.logementRepository.getLogementsByReference(reference);}

}
