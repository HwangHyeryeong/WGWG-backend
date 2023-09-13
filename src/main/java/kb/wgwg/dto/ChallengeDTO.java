package kb.wgwg.dto;

import lombok.*;

import java.time.LocalDateTime;

public class ChallengeDTO {

    @Getter
    @Setter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static final class NChallengeInsertRequestDTO {

        private Long userSeq;

        private String title;

        private String description;

        private String status;

        private LocalDateTime startDate;

        private LocalDateTime endDate;

        private int deposit;

        private int limitAmount;

        private String account;

        @Builder
        public NChallengeInsertRequestDTO(String title, String description, String status,
                                          LocalDateTime startDate, LocalDateTime endDate, int deposit,
                                          int limitAmount, String account)
        {
            this.title = title;
            this.description = description;
            this.status = status;
            this.startDate = startDate;
            this.endDate = endDate;
            this.deposit = deposit;
            this.limitAmount = limitAmount;
            this.account = account;
        }
    }

    @Getter
    @Setter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static final class NChallengeInsertResponseDTO {

        private Long challengeId;

        private String title;

        private String description;

        private String status;

        private LocalDateTime startDate;

        private LocalDateTime endDate;

        private int deposit;

        private int limitAmount;

        @Builder
        public NChallengeInsertResponseDTO(Long challengeId, String title, String description, String status,
                                           LocalDateTime startDate, LocalDateTime endDate, int deposit, int limitAmount)
        {
            this.challengeId = challengeId;
            this.title = title;
            this.description = description;
            this.status = status;
            this.startDate = startDate;
            this.endDate = endDate;
            this.deposit = deposit;
            this.limitAmount = limitAmount;
        }
    }

    @Getter
    @Setter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static final class NChallengeParticipateRequestDTO {

        private Long challengeId;

        private Long userSeq;

        private String account;
    }
}