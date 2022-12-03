package pl.lodz.p.it.opinioncollector.events;

import java.util.UUID;

public class QuestionReportEvent extends Event {
    private UUID questionID;

    public QuestionReportEvent(UUID eventID, UUID userID, String description, UUID questionID) {
        super(eventID, userID, description);
        this.questionID = questionID;
    }

    public UUID getQuestionID() {
        return questionID;
    }
}
