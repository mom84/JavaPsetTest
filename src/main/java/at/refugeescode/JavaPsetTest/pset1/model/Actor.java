package at.refugeescode.JavaPsetTest.pset1.model;
import java.util.List;

public class Actor {

        private List<String> Actorsnames;
        private List<String> ActorGender;

        @Override
        public String toString() {
            return "Actor{" +
                    "mostHiredActors=" + Actorsnames +
                    ", ActorsMaleFemaleRatio=" + ActorGender +
                    '}';
        }

        public void setActorsnames(List<String> Actorsnames) {
            this.Actorsnames = Actorsnames;
        }

        public void setActorGender(List<String> ActorGender) {
            this.ActorGender = ActorGender;
        }

        public List<String> getActorsNames() {

            return Actorsnames;
        }

        public List<String> getActorGender() {
            return ActorGender;
        }
}